package com.company.TicketBookingSystem;
import java.util.List;

class Ticket {
    String source;
    String destination;
    int numberOfPassenger;
    List<Passenger> passengerList;

    Ticket(String source, String destination, int numberOfPassenger, List<Passenger> passenger) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = numberOfPassenger;
        this.passengerList = passenger;
    }
}
