package com.company;

import java.util.ArrayList;
import java.util.List;


class DisplayDetails {
    void verifyTicketNumber(ArrayList<String> routes, int userticketNumber, List<Ticket> ticketDetails) {
        for (Ticket ticket : ticketDetails) {
            if (ticket.ticketNumber == userticketNumber) {
                passengerDetails(ticketDetails);
                ticketDetails(routes, ticketDetails);
            } else {
                System.out.println("Invalid Ticket number");
            }
        }
    }

    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }

    void passengerDetails(List<Ticket> ticketList) {
        System.out.println("Passenger Details");
        System.out.println("Name" + "  \t" + "Age" + "  \t" + "Gender" + " \t" +
                "source" + " \t" + "Destination" + " \t" + "TicketNumber");
        for (Ticket tickets : ticketList) {
            for (int i = 0; i < ticketList.size(); i++)
                System.out.println(tickets.passengerList.get(i).name + " \t" + tickets.passengerList.get(i).age + "   \t" +
                        tickets.passengerList.get(i).name + "  \t" + tickets.source + "  \t" + tickets.destination + "  \t" + tickets.ticketNumber);
        }
    }
//    private void displayPassengerDetails(Ticket ticket) {
//        System.out.println(ticket.passengerList.get(1).name + " \t" + ticket.passengerList.get(1).age + "   \t" +
//                ticket.passengerList.get(1).name + "  \t" + ticket.source + "  \t" + ticket.destination + "  \t" + ticket.ticketNumber);
//    }


    void ticketDetails(ArrayList<String> routes, List<Ticket> ticketDetails) {
        for (Ticket ticket : ticketDetails)
            System.out.println("Number of passengerList :" + ticket.numberOfPassenger);
//            System.out.println("Passenger cost :" +ticket.t(routes,tickets));
    }
}
