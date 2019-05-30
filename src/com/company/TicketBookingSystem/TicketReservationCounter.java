package com.company.TicketBookingSystem;
import java.util.List;

public class TicketReservationCounter {
    Routes routes;

    TicketReservationCounter(Routes route) {
        this.routes = route;
    }

    void showRoute() {
        String routes = this.routes.getterRoute();
        System.out.println(routes);
    }


    Ticket bookTicket(String source,String destination,List<Passenger> passenger){
        Ticket ticket = new Ticket(source,destination,passenger);
      return ticket;
    }

//    int ticketCostCalculation(String route,String source,String destination,List<Passenger> passengers) {
//        int count = 0;
//        int totalCost=0;
//        for (String routes : route) {
//            if ((!routes.equalsIgnoreCase(source)) && (!routes.equalsIgnoreCase(destination))) {
//                count += 1;
//            }
//        }
//        count += 2 * passengers.size();
//        System.out.println(passengers.size());
//        for (Passenger passenger : passengers) {
//            totalCost=0;
//            totalCost += passenger.age <= 12 || passenger.age >= 60 ? count / 2 : count;
//        }
//        return totalCost;
//    }
}