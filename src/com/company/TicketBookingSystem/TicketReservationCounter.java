package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class TicketReservationCounter {
    Route route;

    TicketReservationCounter(Route route) {
        this.route = route;
    }

    void showRoute() {
        String routes = this.route.getterRoute();
        System.out.println(routes);
    }


    List<Ticket> bookTicket(String source, String destination, List<Passenger> passenger, int ticketNumber) {
        int totalCost = 0;
        List<Ticket> tickets = new ArrayList<>();
        Route routes = new Route();
        int routeCount = routes.routeCalculation(source, destination);
        totalCost = ticketCostCalculation(routeCount, passenger);
        Ticket ticket = new Ticket(source, destination, passenger, totalCost, ticketNumber);
        tickets.add(ticket);
        return tickets;
    }

    int ticketCostCalculation(int routeCount, List<Passenger> passengers) {
        int totalCost = 0;
        routeCount += 2 * passengers.size();
        for (Passenger passenger : passengers) {
            if (passenger.checkPassengerAge().equalsIgnoreCase("halfTicket"))
                totalCost += routeCount / 2;
            else {
                totalCost += routeCount;
            }
        }
        return totalCost;
    }
}