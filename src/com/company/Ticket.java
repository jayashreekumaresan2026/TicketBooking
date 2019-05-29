package com.company;

import java.util.ArrayList;
import java.util.List;

class Ticket {
    static String source;
    static String destination;
    static int numberOfPassenger;
    static int ticketNumber;
    Passenger passenger;

    Ticket(String source, String destination, int numberOfPassenger, int ticketNumber, Passenger passenger) {
        this.source = source;
        this.destination = destination;
        this.numberOfPassenger = numberOfPassenger;
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
    }

    static int ticketCostCalculation(ArrayList<String> routes, List<Passenger> passengers) {
        int count = 0;
        int totalCost = 0;

        for (String route : routes) {
            if ((!route.equalsIgnoreCase(source)) && (!route.equalsIgnoreCase(destination))) {
                count += 1;
            }
        }
        count += 2 * numberOfPassenger;
        for (Passenger passenger : passengers) {
            totalCost += passenger.age <= 12 || passenger.age >= 60 ? count / 2 : count;
        }
        return totalCost;
    }
}
