package com.example.backend.route;

import java.util.List;

public class GreenRouteResponse {
    private List<RouteResponse> routes;
    private int totalRoutes;

    public List<RouteResponse> getRoutes() { return routes; }
    public void setRoutes(List<RouteResponse> routes) { this.routes = routes; }

    public int getTotalRoutes() { return totalRoutes; }
    public void setTotalRoutes(int totalRoutes) { this.totalRoutes = totalRoutes; }
}
