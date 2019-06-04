package com.company.TicketBookingSystem;

import java.util.List;

class Ticket {
    private String source;
    private String destination;
    private int numberOfPassenger;
    private List<Passenger> passengerList;
    private int totalCost;

    Ticket(String source, String destination, List<Passenger> passengers, int totalCost) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = passengers.size();
        this.passengerList = passengers;
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        String ticket =" ";
        ticket  ="-------------------Ticket Details--------------------------"+"\n";
        ticket += "Source :" + this.source + "\n";
        ticket += "Destination :" + this.destination + "\n";
        ticket += "Number Of passengers :" + this.numberOfPassenger + "\n";
        ticket += "Name\tAge\tGender\n";
        for(int i=0;i<passengerList.size();i++) {
            ticket += passengerList.get(i).toString();
        }
        ticket += "TotalCost : " + this.totalCost;
        return ticket;
    }
}