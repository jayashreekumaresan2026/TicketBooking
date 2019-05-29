package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Ticket.*;

class DisplayDetails {
    void verifyTicketNumber( int totalCost, int userticketNumber, List<Ticket> ticketDetails) {
        if (ticketNumber == userticketNumber) {
            passengerDetails(ticketDetails);
            ticketDetails(totalCost);
        } else {
            System.out.println("Invalid Ticket number");
        }
    }

    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }

    void passengerDetails( List<Ticket> ticketdetails) {
        System.out.println("Passenger Details");
        System.out.println("Name" + "  \t" + "Age" + "  \t" +   "Gender" +   " \t" +
                "source" + " \t" +   "Destination"+" \t" +   "TicketNumber");
        for (Ticket passenger : ticketdetails) {
            displayPassengerDetails(passenger);
        }
    }

    private void displayPassengerDetails(Ticket ticket) {
        System.out.println(ticket.passenger.name + " \t" + ticket.passenger.age + "   \t" +
                ticket.passenger.gender + "  \t" + ticket.source + "  \t" + ticket.destination+"  \t" +ticket.ticketNumber);
    }


    void ticketDetails(int totalCost) {
        System.out.println("Number of passenger :" + numberOfPassenger);
        System.out.println("Passenger cost :" + totalCost);
    }
}
