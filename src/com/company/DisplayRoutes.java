package com.company;

import java.util.ArrayList;

public class DisplayRoutes {
    void listOfRoutes(ArrayList<String> Routes) {
        for (String routes : Routes) {
            System.out.print(" -> " + routes);
        }

    }

}
