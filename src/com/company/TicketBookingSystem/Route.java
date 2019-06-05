package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    int stationCount(String source, String destination) {
        int count, sourceIndex = 0, destinationIndex = 0;
        for (int i = 0; i < route.size(); i++) {
            if (route.get(i).equalsIgnoreCase(source)) {
                sourceIndex = i;
            } else if (route.get(i).equalsIgnoreCase(destination)) {
                destinationIndex = i;
            }

        }
        count = Math.abs(destinationIndex - sourceIndex) + 1;
        return count;
    }
}