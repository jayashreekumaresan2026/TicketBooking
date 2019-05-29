package com.company.TicketBookingSystem;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Routes {
    List<String> routeList() {
        List<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
        List<String> routeDetails = showRoutes(routes);
        return routeDetails;
    }

    List<String> showRoutes(List<String> routes) {
        for (String route : routes) {
            System.out.print(" -> " + route);
        }
        return routes;
    }
}
