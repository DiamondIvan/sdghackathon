package com.example.backend;

public class CO2Request {
    private double distance;
    private String transportType;
    private int passengers = 1;

    public CO2Request() {}

    public double getDistance() { return distance; }
    public void setDistance(double distance) { this.distance = distance; }

    public String getTransportType() { return transportType; }
    public void setTransportType(String transportType) { this.transportType = transportType; }

    public int getPassengers() { return passengers; }
    public void setPassengers(int passengers) { this.passengers = passengers; }
}
