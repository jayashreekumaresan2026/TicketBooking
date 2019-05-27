package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Passenger userInput(String source, String destination) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender, source, destination);
    }

    public static void main(String[] args) {
        int totalCost = 0;
        Scanner keyBoard = new Scanner(System.in);
        TicketCostCalculation costCalculation = new TicketCostCalculation();
        DisplayDetails details = new DisplayDetails();
        ArrayList<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
        details.listOfRoutes(routes);
        System.out.println();
        System.out.print("enter you Source :");
        String source = keyBoard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyBoard.nextLine();
        System.out.print("enter the number of Passenger :");
        int numberOfPassenger = keyBoard.nextInt();
        List<Passenger> passengers = new ArrayList<>(numberOfPassenger);
        for (int i = 0; i < numberOfPassenger; i++) {
            System.out.println("Enter the detail for the passenger " + (i + 1));
            Passenger passengerDetail = Main.userInput(source, destination);
            passengers.add(passengerDetail);

        }
        totalCost= costCalculation.tickCostCalculation(routes, source, destination, passengers);
        details.passengerDetails(passengers);
        details.ticketDetails(totalCost, numberOfPassenger);
    }
}

