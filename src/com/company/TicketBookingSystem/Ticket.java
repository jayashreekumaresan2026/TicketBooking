package com.company.TicketBookingSystem;

import java.util.List;

class Ticket {
    private String source;
    private String destination;
    private int numberOfPassenger;
    private List<Passenger> passengerList;

    Ticket(String source, String destination, List<Passenger> passengers) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = passengers.size();
        this.passengerList = passengers;
    }

    @Override
    public String toString() {
        String ticket = "";
        ticket = "Source :" + this.source + "\n";
        ticket += "Destination :" + this.destination + "\n";
        ticket += "Number Of passengers :" + this.numberOfPassenger + "\n";
        ticket += "Name\tAge\tGender\n";
        for (Passenger passenger : passengerList) {
            ticket += passenger.name + " \t" + passenger.age + "   \t" + passenger.gender + "\n";
        }
        return ticket;
    }
}