package com.company;

import java.util.ArrayList;

public class DisplayDetails {
    static void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }

    static void displayPassangerDetails(Passenger[] passengers) {
        System.out.println("Passenger Details");
        System.out.println("Sno " + "Name" + "  \t" + "Age" + "  \t" + "Gender" + " \t" + "source" + " \t" + "Destination");
        for (int i = 0; i < passengers.length; i++) {
            System.out.println(i + 1 + " \t" + passengers[i].name + " \t" + passengers[i].age + "   \t" + passengers[i].gender + "  \t" + passengers[i].source + "  \t" + passengers[i].destination);
        }
    }

}
