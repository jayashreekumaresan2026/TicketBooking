package com.company;

import java.util.ArrayList;

public class TicketCostCalculation {
    int tickCostCalculation(ArrayList<String> routes, int numberOfPassenger,String source,String destination) {
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
