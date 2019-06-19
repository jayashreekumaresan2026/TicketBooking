package com.company.TicketBookingSystem;

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

    Ticket bookTicket(String source, String destination, List<Passenger> passenger, int ticketNumber) {
        int totalCost;
        Route routes = new Route();
        int stationCount = routes.stationCount(source, destination);
        totalCost = ticketCostCalculation(stationCount, passenger);
        Ticket ticket = new Ticket(source, destination, passenger, totalCost, ticketNumber);
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

    void ticketOption(List<Ticket> ticketList, int userInput) {
        for (int i = 0; i < ticketList.size(); i++) {
            if (userInput == (i + 1)) {
                System.out.println(ticketList.get(i).toString());
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        }
    }

    void DisplayListOfTickets(List<Ticket> tickets) {
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i).toString());
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }

    void deleteParticularTickets(List<Ticket> tickets, int userInput) {
        for (int i = 0; i < tickets.size(); i++) {
            if (userInput == (i + 1)) {
                System.out.println(tickets.remove(tickets.get(i)));
            }
        }
        if (tickets.size() > 1) {
            for (int i = 0; i < tickets.size(); i++) {
                System.out.println(tickets.get(i).toString());
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
        } else {
            System.out.println("No Ticket available");
        }
    }
}

