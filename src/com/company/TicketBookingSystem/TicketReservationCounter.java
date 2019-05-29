package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketReservationCounter {
    static Scanner keyboard = new Scanner(System.in);

    public Passenger getPassengerDetails() {
        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender);
    }

    List<Ticket> getTicketDetails() {
        List<Passenger> passengers = new ArrayList<>();
        List<Ticket> tickets = new ArrayList<>();
        System.out.print("enter you Source :");
        String source = keyboard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyboard.nextLine();
        System.out.print("enter the number of Passengers :");
        int numberOfPassenger = keyboard.nextInt();
        keyboard.nextLine();
        for (int j = 0; j < numberOfPassenger; j++) {
            System.out.println("Enter the detail for the passengerList :" + (j + 1));
            passengers.add(this.getPassengerDetails());
            Ticket ticket = new Ticket(source, destination, numberOfPassenger, passengers);
            tickets.add(ticket);

        }
        return tickets;
    }


    void showPassengerDetails(List<Ticket> ticketList,List<String> routeList) {
        System.out.println("Passenger Details");
        System.out.println("Name" + "  ||" + "Age" + "  ||" + "Gender" + " ||" + "source" + " ||" + "Destination");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Ticket ticket : ticketList) {
            for (Passenger passenger : ticket.passengerList) {
                System.out.println(passenger.name + " ||" + passenger.age + "   ||" +
                        passenger.gender + "  ||" + ticket.source + "  ||" + ticket.destination + "  ||" +ticket.ticketCostCalculation(routeList));
            }
        }
    }
}