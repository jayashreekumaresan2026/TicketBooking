package com.company;

import java.util.ArrayList;
import java.util.List;

class TicketCostCalculation {
    int tickCostCalculation(ArrayList<String> routes, String source, String destination, List<Passenger> passengers) {
        int count = 0;
        int totalCost = 0;

        for (String route : routes) {
            if ((!route.equalsIgnoreCase(source)) && (!route.equalsIgnoreCase(destination))) {
                count += 1;
            }
        }
        count += 2;
        for (Passenger passenger : passengers) {
            totalCost += passenger.age <= 12 || passenger.age >= 60 ? count / 2 : count;
        }
        return totalCost;
    }
}
