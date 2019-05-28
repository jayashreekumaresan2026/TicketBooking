package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicketBooking {
    static Scanner keyboard = new Scanner(System.in);

    private static Passenger userInput(String source, String destination) {
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

        Ticket costCalculation = new Ticket();
        DisplayDetails details = new DisplayDetails();
        ArrayList<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
        details.listOfRoutes(routes);
        System.out.println();
        System.out.println("Enter the number of tickets");
        int ticket = Integer.parseInt(keyboard.nextLine());
        Passenger[] numberOfTickets = new Passenger[ticket];
        for (int i = 0; i < numberOfTickets.length; i++) {
            {
                System.out.println("Enter the details of the ticket" + (i + 1));
                double ticketNumber = Math.random();
                System.out.println("Ticket number:" + ticketNumber);
                System.out.print("enter you Source :");
                String source = keyboard.nextLine();
                System.out.print("enter you destination :");
                String destination = keyboard.nextLine();
                keyboard.nextLine();
                System.out.print("enter the number of Passenger :");
                int numberOfPassenger = keyboard.nextInt();
                List<Passenger> passengers = new ArrayList<>(numberOfPassenger);
                for (int j = 0; j < numberOfPassenger; j++) {
                    System.out.println("Enter the detail for the passenger " + (i + 1));
                    Passenger passengerDetail = TicketBooking.userInput(source, destination);
                    passengers.add(passengerDetail);

                }
                totalCost = costCalculation.ticketCostCalculation(routes, source, destination, passengers, numberOfPassenger);
                details.passengerDetails(passengers);
                details.ticketDetails(totalCost, numberOfPassenger);
            }
        }
    }
}
