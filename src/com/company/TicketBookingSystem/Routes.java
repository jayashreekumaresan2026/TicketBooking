package com.company.TicketBookingSystem;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Routes {
    private List<String> route;

    Routes() {
        this.route = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
    }

    String getterRoute() {
        String place = " ";
        for (int i = 0; i < this.route.size(); i++) {
            place += route.get(i) + "->";
        }
        return place;
    }
}
