package com.company.TicketBookingSystem;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TicketReservationCounter ticketReservationCounter = new TicketReservationCounter();
        Routes route = new Routes();
        List<String> routes =route.routeList();
        System.out.println();
        List<Ticket> tickets=ticketReservationCounter.getTicketDetails();
        ticketReservationCounter.showPassengerDetails(tickets,routes);
//        .ticketCostCalculation(tickets,route);

    }
}
