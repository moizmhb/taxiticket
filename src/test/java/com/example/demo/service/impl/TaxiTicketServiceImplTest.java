package com.example.demo.service.impl;

import com.example.demo.model.TaxiTicket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TaxiTicketServiceImplTest {

    private TaxiTicketServiceImpl ticketService;

    @Before
    public void setUp() {
        ticketService = new TaxiTicketServiceImpl();
    }

    @Test
    public void testGenerateTicket_Pune_Mumbai() {
        TaxiTicket ticket = ticketService.generateTicket("Pune", "Mumbai", 2);
        assertNotNull(ticket);
        assertEquals(1700, ticket.getTotalFare());
    }

    @Test
    public void testGenerateTicket_Pune_Nasik() {
        TaxiTicket ticket = ticketService.generateTicket("Pune", "Nasik", 1);
        assertNotNull(ticket);
        assertEquals(1250, ticket.getTotalFare());
    }

    @Test
    public void testGenerateTicket_Mumbai_Goa() {
        TaxiTicket ticket = ticketService.generateTicket("Mumbai", "Goa", 2);
        assertNotNull(ticket);
        assertEquals(4000, ticket.getTotalFare());
    }

    @Test
    public void testGenerateTicket_Mumbai_Nasik() {
        TaxiTicket ticket = ticketService.generateTicket("Mumbai", "Nasik", 1);
        assertNotNull(ticket);
        assertEquals(1150 , ticket.getTotalFare());
    }

}