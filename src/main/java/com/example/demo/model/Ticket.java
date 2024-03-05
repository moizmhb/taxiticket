package com.example.demo.model;

public abstract class Ticket {

    String source;
    String destination;
    int kms;
    int noOfTravellers;
    int totalFare;

    public Ticket(String source, String destination, int kms, int numTravelers, int totalFare) {
            this.source = source;
            this.destination = destination;
            this.kms = kms;
            this.noOfTravellers = numTravelers;
            this.totalFare = totalFare;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(int noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }
}
