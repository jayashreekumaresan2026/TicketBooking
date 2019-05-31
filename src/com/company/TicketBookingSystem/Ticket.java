package com.company.TicketBookingSystem;

import java.util.List;

class Ticket {
    private String source;
    private String destination;
    private int numberOfPassenger;
    private List<Passenger> passengerList;
    private int totalCost;
    private int ticketNumber;

    Ticket(String source, String destination, List<Passenger> passengers, int totalCost, int ticketNumber) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = passengers.size();
        this.passengerList = passengers;
        this.totalCost = totalCost;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        String ticket =" ";
        ticket = "TicketNumber :" + this.ticketNumber + "\n";
        ticket += "Source :" + this.source + "\n";
        ticket += "Destination :" + this.destination + "\n";
        ticket += "Number Of passengers :" + this.numberOfPassenger + "\n";
        ticket += "Name\tAge\tGender\n";
        for (Passenger passenger : passengerList) {
            ticket += passenger.getName() + " \t" + passenger.getAge() + "   \t" + passenger.getGender() + "\n";
        }
        ticket += "TotalCost : " + this.totalCost;
        return ticket;
    }
}