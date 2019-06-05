package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.Scanner;

public class TicketBookingSystem {
    Scanner keyboard = new Scanner(System.in);


    Passenger getPassengerDetails() {
        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Route route = new Route();
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        TicketReservationCounter ticketReservationCounter = new TicketReservationCounter(route);
        ticketReservationCounter.showRoute();
        System.out.print("Enter number of tickets :");
        int numberOfTickets = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < numberOfTickets; i++) {
            List<Passenger> passengers = new ArrayList<>();
            System.out.println("Details of the ticket  :" + (i + 1));
            System.out.print("enter you Source :");
            String source = keyboard.nextLine();
            System.out.print("enter you destination :");
            String destination = keyboard.nextLine();
            System.out.print("enter the number of Passengers :");
            int numberOfPassenger = keyboard.nextInt();
            keyboard.nextLine();
            for (int j = 0; j < numberOfPassenger; j++) {
                System.out.println("Enter the detail for the passengerList :" + (j + 1));
                passengers.add(ticketBookingSystem.getPassengerDetails());
            }
            ticketBookingSystem.displayPassengerDetails(passengers, destination, source);
            List<Ticket> tickets = ticketReservationCounter.bookTicket(source, destination, passengers);
            for (int j = 0; j < tickets.size(); j++) {
                System.out.println(tickets.get(j).toString());
            }
        }
    }
    void displayPassengerDetails(List<Passenger> passengerList, String source, String destination) {
        String passengers = " ";
        passengers = "----------Passenger details-------------------"+"\n";
        passengers += "Source :" + source + "\n";
        passengers += "Destination :" + destination + "\n";
        passengers += "Name\tAge\tGender\n";
        for(int i=0;i<passengerList.size();i++) {
            passengers += passengerList.get(i).toString();
        }
        System.out.println(passengers);

    }

}
