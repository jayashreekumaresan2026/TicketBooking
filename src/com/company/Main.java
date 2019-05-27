package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        DisplayRoutes Displayroutes = new DisplayRoutes();
        ArrayList<String> Routes = new ArrayList<>();
        Routes.add("Tambaram");
        Routes.add("Sanatorium");
        Routes.add("Chrompet");
        Routes.add("Tirusulam");
        Routes.add("Meenambakkam");
        Displayroutes.listOfRoutes(Routes);
        System.out.println();
        System.out.print("enter you Source :");
        String source = keyBoard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyBoard.nextLine();


    }
}

