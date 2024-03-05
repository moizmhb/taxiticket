package com.example.demo.service.impl;

import com.example.demo.model.Routes;
import com.example.demo.service.RouteService;

import java.util.HashMap;
import java.util.Map;

public class TaxiRouteServiceImpl implements RouteService {

    private Map<String, Routes> routes = new HashMap<>();

    @Override
    public Map<String, Routes> initializeRoutes() {
        routes.put("PUNE-MUMBAI", new Routes("PUNE", "MUMBAI", 120));
        routes.put("PUNE-NASIK", new Routes("PUNE", "NASIK", 200));
        routes.put("MUMBAI-GOA", new Routes("MUMBAI", "GOA", 350));
        routes.put("MUMBAI-NASIK", new Routes("MUMBAI", "NASIK", 180));
        return routes;
    }
}

