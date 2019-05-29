package com.company.TicketBookingSystem;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Routes {
    void routeList() {
        List<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
        showRoutes(routes);
    }

    void showRoutes(List<String> routes) {
        for (String route : routes) {
            System.out.print(" -> " + route);
        }
    }
}
