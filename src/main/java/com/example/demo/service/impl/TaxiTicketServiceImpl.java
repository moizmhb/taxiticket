package com.example.demo.service.impl;

import com.example.demo.model.Routes;
import com.example.demo.model.TaxiTicket;
import com.example.demo.service.RouteService;
import com.example.demo.service.TicketService;

import java.util.Map;

public class TaxiTicketServiceImpl implements TicketService {
    Map<String, Routes> stringRoutesMap;
    RouteService routeService;
    TaxiFareServiceImpl fareService;
    TaxiTicketServiceImpl() {
        routeService = new TaxiRouteServiceImpl();
        fareService = new TaxiFareServiceImpl();
        stringRoutesMap = routeService.initializeRoutes();
    }

    @Override
    public TaxiTicket generateTicket(String source, String destination, int numTravelers) {
        String route = source.toUpperCase() + "-" + destination.toUpperCase();

        int distance = stringRoutesMap.containsKey(route) ? stringRoutesMap.get(route).getDistance() : 0;
        /* Routes route = stringRoutesMap.get(routeKey);
        if (route == null) {
            throw new IllegalArgumentException("Route not found");
        }*/
        int totalFare = fareService.calculateFare(distance, numTravelers);
        return new TaxiTicket(source, destination, distance, numTravelers, totalFare);
    }

}
