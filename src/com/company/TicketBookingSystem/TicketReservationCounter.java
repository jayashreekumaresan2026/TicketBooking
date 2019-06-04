package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class TicketReservationCounter {
    Stations route;
    final int stationCost=2;

    TicketReservationCounter(Stations route) {
        this.route = route;
    }

    void showRoute() {
        String routes = this.route.getSations();
        System.out.println(routes);
    }

    List<Ticket> bookTicket(String source, String destination, List<Passenger> passenger) {
        int totalCost;
        List<Ticket> tickets = new ArrayList<>();
        Stations routes = new Stations();
        int stationCount = routes.stationCount(source, destination);
        totalCost = ticketCostCalculation(stationCount, passenger);
        Ticket ticket = new Ticket(source, destination, passenger, totalCost);
        tickets.add(ticket);
        return tickets;
    }

    int ticketCostCalculation(int stationCount, List<Passenger> passengers) {
        int finalCost = 0;
        int routeCost = stationCount * stationCost;
        for (Passenger passenger : passengers)
            if (passenger.isChild() || passenger.isAgedPerson()) {
                finalCost += routeCost / 2;
            } else {
                finalCost += routeCost;
            }
        return finalCost;
    }
}
