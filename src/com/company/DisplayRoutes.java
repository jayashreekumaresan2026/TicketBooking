package com.company;

import java.util.ArrayList;

public class DisplayRoutes {
    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }
    }
    void displayPassangerDetails(Passenger[] passengers) {
        System.out.println("Passenger Details");
        System.out.println("Sno "+"Name" + "  \t" + "Age" + "  \t" + "Gender" + " \t" + "source" + " \t" + "Destination");
        for (int i = 0; i < passengers.length; i++)
        {
            System.out.println( i+1+" \t" +passengers[i].name+" \t"+passengers[i].age+"   \t"+passengers[i].gender+"  \t"+passengers[i].source+"  \t"+passengers[i].destination);
        }
    }
}
