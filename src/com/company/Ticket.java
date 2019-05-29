package com.company;

import java.util.ArrayList;
import java.util.List;

class Ticket {
    String source;
    String destination;
    int numberOfPassenger;
    int ticketNumber;
    List<Passenger> passengerList;

    Ticket(String source, String destination, int numberOfPassenger, int ticketNumber, List<Passenger> passenger) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = numberOfPassenger;
        this.ticketNumber = ticketNumber;
        this.passengerList = passenger;
    }
    int ticketCostCalculation(ArrayList<String> routes, List<Ticket> tickets) {
        int count = 0;
        int totalCost = 0;

        for (String route : routes) {
            if ((!route.equalsIgnoreCase(source)) && (!route.equalsIgnoreCase(destination))) {
                count += 1;
            }
        }
        count += 2 * numberOfPassenger;
        System.out.println(numberOfPassenger);
        for (Passenger passenger : passengerList) {
            totalCost += passenger.age <= 12 || passenger.age >= 60 ? count / 2 : count;
        }
        return totalCost;
    }
}
