package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicketBookingCounter {
    static Scanner keyboard = new Scanner(System.in);

    private static Passenger userInput() {
        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender);
    }

    public static List<Ticket> getTicketDetails(ArrayList<String> routes) {
        List<Ticket> tickets = new ArrayList<>();
        DisplayDetails details = new DisplayDetails();
        System.out.print("Enter the number of tickets : ");
        int ticketNumber = (int) (Math.random() * 100);
        int numberOfTickets = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("Enter the details of the ticket  : " + (i + 1));
            System.out.print("enter you Source :");
            String source = keyboard.nextLine();
            System.out.print("enter you destination :");
            String destination = keyboard.nextLine();
            System.out.print("enter the number of Passenger :");
            int numberOfPassenger = keyboard.nextInt();
            keyboard.nextLine();
            List<Passenger> passengers = new ArrayList<>();
            for (int j = 0; j < numberOfPassenger; j++) {
                System.out.println("Enter the detail for the passengerList " + (j + 1));
                Passenger passengerDetail = userInput();
                passengers.add(passengerDetail);

            }
            Ticket ticket = new Ticket(source, destination, numberOfPassenger, ticketNumber, passengers);
            tickets.add(ticket);
            details.passengerDetails(tickets);
            details.ticketDetails(routes, tickets);
        }
        return tickets;
    }

    public static void main(String[] args) {
        DisplayDetails details = new DisplayDetails();
        ArrayList<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Pallavaram", "Tirusulam", "Meenambakkam"));
        details.listOfRoutes(routes);
        System.out.println();
        List<Ticket> ticketList = TicketBookingCounter.getTicketDetails(routes);
        System.out.println("Enter the ticket number to display :");
        int userTicketNumber = Integer.parseInt(keyboard.nextLine());
        details.verifyTicketNumber(routes, userTicketNumber, ticketList);
    }
}
