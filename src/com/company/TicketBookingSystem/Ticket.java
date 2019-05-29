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

    int ticketCostCalculation(List<String> routeList) {
        int count = 0;
        int totalCost=0;
        for (String route : routeList) {
            if ((!route.equalsIgnoreCase(source)) && (!route.equalsIgnoreCase(destination))) {
                count += 1;
            }
        }
        count += 2 * numberOfPassenger;
        System.out.println(numberOfPassenger);
        for (Passenger passenger : passengerList) {
            totalCost=0;
            totalCost += passenger.age <= 12 || passenger.age >= 60 ? count / 2 : count;
        }
        return totalCost;
    }
}
