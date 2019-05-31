package com.company.TicketBookingSystem;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Route {
    private List<String> route;

    Route() {
        this.route = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
    }

    String getterRoute() {
        String place = " ";
        for (int i = 0; i < this.route.size(); i++) {
            place += route.get(i) + "->";
        }
        return place;
    }

    int routeCalculation(String source, String destination) {
        int count = 0;
        for (String route : route) {
            if ((!route.equalsIgnoreCase(source)) && (!route.equalsIgnoreCase(destination))) {
                count += 1;
            }
        }
        System.out.println( "firstcount"+count);
        return count;

    }
}
