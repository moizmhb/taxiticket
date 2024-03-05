package com.example.demo.service;

import com.example.demo.model.TaxiTicket;
import com.example.demo.model.Ticket;

public interface TicketService {


    Ticket generateTicket(String source, String destination, int numTravelers);
}
