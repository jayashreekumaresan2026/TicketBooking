package com.company;

import java.util.ArrayList;

public class Passenger {

    String name;
    int age;
    String gender;
    String source;
    String destination;

    Passenger(String name, int age, String gender, String source, String destination) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.source = source;
        this.destination = destination;
    }

    int tickCostCalculation(ArrayList<String> routes,int numberOfPassenger) {
       int count = 0;
       int totalCost;
       for (int i = 0; i < routes.size(); i++) {
           if ((!routes.get(i).equalsIgnoreCase(source)) && (!routes.get(i).equalsIgnoreCase(destination))) {
               count = count + 1;
           }
       }
       totalCost = (count + 2) * numberOfPassenger;
       return totalCost;
   }
}
