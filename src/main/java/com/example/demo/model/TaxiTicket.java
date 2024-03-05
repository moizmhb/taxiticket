package com.example.demo.model;

public class TaxiTicket extends Ticket {
    public TaxiTicket(String source, String destination, int kms, int numTravelers, int totalFare) {
        super(source, destination, kms, numTravelers, totalFare);
    }
}
