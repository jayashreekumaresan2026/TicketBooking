package com.company.ticketbookingsystemoldcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicketBookingCounter {
    static Scanner keyboard = new Scanner(System.in);

    private static Passenger getPassangerDetails() {
        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender);
    }
    private static Ticket getSingleTicketDetails(int ticketNumber) {
        System.out.print("enter you Source :");
        String source = keyboard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyboard.nextLine();
        List<Passenger> passengers = new ArrayList<>();
        System.out.print("enter the number of Passengers :");
        int numberOfPassenger = keyboard.nextInt();
        keyboard.nextLine();
        for (int j = 0; j < numberOfPassenger; j++) {
            System.out.println("Enter the detail for the passengerList :" + (j + 1));
            Passenger passengerDetail = getPassangerDetails();
            passengers.add(passengerDetail);
            int length=passengers.size();
            System.out.println(length);
        }
        Ticket ticket = new Ticket(source, destination, numberOfPassenger, ticketNumber, passengers);
        return ticket;
    }


    public static List<Ticket> getTicketDetails(ArrayList<String> routes) {
        List<Ticket> tickets = new ArrayList<>();
        DisplayDetails details = new DisplayDetails();
        //Get Number of Tickets
        System.out.print("Enter the number of tickets : ");
        int numberOfTickets = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < numberOfTickets; i++) {
            int ticketNumber = (int) (Math.random() * 100);
            System.out.println("Enter the details of the ticket  : " + (i + 1));
            tickets.add(getSingleTicketDetails(ticketNumber));
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
