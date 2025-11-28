package com.example.backend.route;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/calculator")
public class CO2CalculatorController {

    /**
     * Calculate CO2 emissions based on fuel consumed.
     * Example request: GET /api/calculator?fuelLiters=10
     */
    @GetMapping
    public ResponseEntity<CO2Response> calculateCO2(@RequestParam double fuelLiters) {
        double emissionFactor = 2.31; // kg CO₂ per liter for gasoline
        double co2Kg = fuelLiters * emissionFactor;

        CO2Response response = new CO2Response();
        response.setFuelLiters(fuelLiters);
        response.setCo2Kg(co2Kg);

        return ResponseEntity.ok(response);
    }

    // Response class
    public static class CO2Response {
        private double fuelLiters;
        private double co2Kg;

        public double getFuelLiters() { return fuelLiters; }
        public void setFuelLiters(double fuelLiters) { this.fuelLiters = fuelLiters; }

        public double getCo2Kg() { return co2Kg; }
        public void setCo2Kg(double co2Kg) { this.co2Kg = co2Kg; }
    }
}
