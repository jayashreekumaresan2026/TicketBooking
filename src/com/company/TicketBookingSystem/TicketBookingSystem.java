package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Routes routes = new Routes();
        TicketReservationCounter ticketReservationCounter = new TicketReservationCounter(routes);
        ticketReservationCounter.showRoute();
        List<Passenger> passengers = new ArrayList<>();
        System.out.print("enter you Source :");
        String source = keyboard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyboard.nextLine();
        System.out.print("enter the number of Passengers :");
        int numberOfPassenger = keyboard.nextInt();
        keyboard.nextLine();
        for (int j = 0; j < numberOfPassenger; j++) {
            System.out.println("Enter the detail for the passengerList :" + (j + 1));
            System.out.print("enter your name :");
            String name = keyboard.nextLine();
            System.out.print("enter your age :");
            int age = Integer.parseInt(keyboard.nextLine());
            System.out.print("enter your gender :");
            String gender = keyboard.nextLine();
            Passenger passenger = new Passenger(name, age, gender);
            passengers.add(passenger);
        }
        Ticket ticket = ticketReservationCounter.bookTicket(source, destination, passengers);
        System.out.println(ticket.toString());
    }
}
