package com.example.backend.route;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class AIModelService {

  @Value("${gemini.api.key}")
  private String apiKey;

  @Value("${gemini.model:gemini-2.0-flash-lite}") // Use the configured Gemini model
  private String model;

  /**
   * Sends user message to Gemini AI and returns the AI response.
   * 
   * @param userMessage The message from the user
   * @return AI response text
   */
  public String getAIResponse(String userMessage) {
    if (userMessage == null || userMessage.isBlank()) {
      return "Please provide a valid message.";
    }

    try {
      Client client = Client.builder().apiKey(apiKey).build();

      GenerateContentResponse response =
          client.models.generateContent(
              model, // Use the configured model
              userMessage,
              null); // No safety settings or other options for now

      if (response != null && response.text() != null) {
        return response.text();
      } else {
        return "AI did not return a response.";
      }

    } catch (Exception e) {
      // Log the error and return a friendly message
      e.printStackTrace();
      return "Error contacting AI: " + e.getMessage();
    }
  }
}
