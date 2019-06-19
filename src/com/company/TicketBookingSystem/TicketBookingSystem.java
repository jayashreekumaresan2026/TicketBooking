package com.company.TicketBookingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.String;
import java.util.Scanner;

public class TicketBookingSystem {
    Scanner keyboard = new Scanner(System.in);

    Passenger getPassengerDetails() {
        System.out.print("Enter your name :");
        String name = keyboard.nextLine();
        System.out.print("Enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter your gender :");
        String gender = keyboard.nextLine();
        return new Passenger(name, age, gender);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Route route = new Route();
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        TicketReservationCounter ticketReservationCounter = new TicketReservationCounter(route);
        ticketReservationCounter.showRoute();
        List<Ticket>  ticketList=new ArrayList<>();
        System.out.print("Enter number of tickets :");
        int numberOfTickets = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < numberOfTickets; i++) {
            List<Passenger> passengers = new ArrayList<>();
            System.out.println("Details of the ticket  :" + (i + 1));
            System.out.print("Enter you Source :");
            String source = keyboard.nextLine();
            System.out.print("Enter you destination :");
            String destination = keyboard.nextLine();
            System.out.print("Enter the number of Passengers :");
            int numberOfPassenger = keyboard.nextInt();
            keyboard.nextLine();
            for (int j = 0; j < numberOfPassenger; j++) {
                System.out.println("Enter the detail for the passengerList :" + (j + 1));
                passengers.add(ticketBookingSystem.getPassengerDetails());
            }
            ticketBookingSystem.displayPassengerDetails(passengers, destination, source);
            int ticketNumber = (i + 1);
            Ticket ticket = ticketReservationCounter.bookTicket(source, destination, passengers,ticketNumber);
            System.out.println("-------Ticket Details--------");
            System.out.println(ticket.toString());
            ticketList.add(ticket);
        }
        System.out.println("Select the option :");
        System.out.println(" 1.Enter the ticket number to display the ticket :");
        System.out.println(" 2.Get all the ticket detail :");
        System.out.println(" 3.Delete the ticket :");
        System.out.println("Enter your choice");
        int choice = keyboard.nextInt();
        System.out.println("Enter the number to display or delete the ticket");
        int userInput = keyboard.nextInt();
        ticketReservationCounter.selectTicketToDisplay(userInput, ticketList,choice);
    }

    void displayPassengerDetails(List<Passenger> passengerList, String source, String destination) {
        String passengers = " ";
        passengers = "----------Passenger details-------------------" + "\n";
        passengers += "Source :" + source + "\n";
        passengers += "Destination :" + destination + "\n";
        passengers += "Name\tAge\tGender\n";
        for (int i = 0; i < passengerList.size(); i++) {
            passengers += passengerList.get(i).toString();
        }
        System.out.println(passengers);
    }
}
