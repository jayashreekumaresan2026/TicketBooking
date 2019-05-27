package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            DisplayRoutes Displayroutes = new DisplayRoutes();
            ArrayList<String> Routes = new ArrayList<>();
            Routes.add("Tambaram");
            Routes.add("Sanatorium");
            Routes.add("Chrompet");
            Routes.add("Tirusulam");
            Routes.add("Meenambakkam");
            Displayroutes.listOfRoutes(Routes);
        }


    }

