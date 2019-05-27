package com.company;

import java.util.ArrayList;
import java.util.List;

class DisplayDetails {

    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }

    void passengerDetails(List<Passenger> passengers) {
        System.out.println("Passenger Details");
        System.out.println("Name" + "  \t" + "Age" + "  \t" + "Gender" + " \t" + "source" + " \t" + "Destination");
        for (Passenger passenger : passengers) {
            displayPassengerDetails(passenger);
        }
    }

  private void displayPassengerDetails(Passenger passengers) {
        System.out.println(passengers.name + " \t" + passengers.age + "   \t" + passengers.gender + "  \t" + passengers.source + "  \t" + passengers.destination);
    }

    void ticketDetails(int totalCost, int numberOfPassenger) {
        System.out.println("Number of passenger :" + numberOfPassenger);
        System.out.println("Passenger cost :" + totalCost);
    }
}
