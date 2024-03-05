package com.example.demo.service.impl;

import com.example.demo.service.FareService;
import static com.example.demo.utils.TaxiConstant.*;

public class TaxiFareServiceImpl implements FareService {

    @Override
    public int calculateFare(int distance, int numTravelers){
        int fare = 0;
        if(distance == 0){
            return fare;
        }
        if(distance <= DISTANCE_LIMIT){
            fare = BASE_FARE;
        }else {
            fare = BASE_FARE + (distance - DISTANCE_LIMIT) * PER_KM_FARE;
        }
        return fare*numTravelers;
    }
}
