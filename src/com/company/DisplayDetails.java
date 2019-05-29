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
        for (Ticket ticket : ticketList) {
            for (Passenger passenger : ticket.passengerList) {
                System.out.println(passenger.name + " \t" + passenger.age + "   \t" +
                        passenger.gender + "  \t" + ticket.source + "  \t" + ticket.destination + "  \t" + ticket.ticketNumber);
            }
        }
    }

    void ticketDetails(ArrayList<String> routes, List<Ticket> ticketDetails) {
        for (Ticket ticket : ticketDetails)
            System.out.println("Number of passengerList :" + ticket.numberOfPassenger);
            System.out.println("Passenger cost :" +"");
    }
}
