package com.example.demo.service.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiFareServiceImplTest {

    @Test
    public void testCalculateFareWithDistanceWithinLimit() {
        TaxiFareServiceImpl taxiFareService = new TaxiFareServiceImpl();
        int fare = taxiFareService.calculateFare(10, 2);
        assertEquals(1500, fare);
    }

    @Test
    public void testCalculateFareWithDistanceExceedingLimit() {
        TaxiFareServiceImpl taxiFareService = new TaxiFareServiceImpl();
        int fare = taxiFareService.calculateFare(20, 3);
        assertEquals(2250, fare);
    }


    @Test
    public void testCalculateFareWithNegativeDistance() {
        TaxiFareServiceImpl taxiFareService = new TaxiFareServiceImpl();
        int fare = taxiFareService.calculateFare(500, 2);
        assertEquals(5500, fare);
    }

}