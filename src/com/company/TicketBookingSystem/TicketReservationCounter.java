package com.company.TicketBookingSystem;
import java.util.HashMap;
import java.util.List;

public class TicketReservationCounter {
    Route route;
    final int stationCost = 2;

    TicketReservationCounter(Route route) {
        this.route = route;
    }

    void showRoute() {
        String routes = this.route.getRoute();
        System.out.println(routes);
    }

    Ticket bookTicket(String source, String destination, List<Passenger> passenger) {
        int totalCost;
        Route routes = new Route();
        int stationCount = routes.stationCount(source, destination);
        totalCost = ticketCostCalculation(stationCount, passenger);
        Ticket ticket = new Ticket(source, destination, passenger, totalCost);
        return ticket;
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

    void selectTicketToDisplay(int userInput, HashMap<Integer, Ticket> tickets) {
        for (Integer key : tickets.keySet()) {
            if (key == userInput) {
                System.out.println("Ticket" + tickets.get(key));
            }
        }
    }
}
