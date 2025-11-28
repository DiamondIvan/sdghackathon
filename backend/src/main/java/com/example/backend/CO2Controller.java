package com.example.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CO2Controller {

    // Allow CORS for frontend running on another port
    @CrossOrigin(origins = "http://localhost:3002")
    @PostMapping("/calculate-co2")
    public Map<String, Double> calculateCO2(@RequestBody CO2Request request) {
        double emissionFactor = getEmissionFactor(request.getTransportType());
        double co2 = (request.getDistance() * emissionFactor) / Math.max(1, request.getPassengers());

        Map<String, Double> result = new HashMap<>();
        result.put("co2", co2);
        return result;
    }

    private double getEmissionFactor(String transportType) {
        if (transportType == null) return 0;
        switch (transportType.toLowerCase()) {
            case "car": return 0.192;
            case "bus": return 0.105;
            case "train": return 0.041;
            case "plane": return 0.255;
            default: return 0;
        }
    }
}
