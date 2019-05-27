package com.company;

import java.util.List;
import java.util.ArrayList;

class DisplayDetails {
    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }

    void displayPassengerDetails(List<Passenger> passengers) {
        System.out.println("Passenger Details");
        System.out.println("Sno " + "Name" + "  \t" + "Age" + "  \t" + "Gender" + " \t" + "source" + " \t" + "Destination");
        for (int i = 0; i < passengers.size(); i++) {
            Passengerdetails(i, passengers.get(i));
        }
    }

    void Passengerdetails(int i, Passenger passengers) {
        System.out.println(i + 1 + " \t" + passengers.name + " \t" + passengers.age + "   \t" + passengers.gender + "  \t" + passengers.source + "  \t" + passengers.destination);
    }
}
