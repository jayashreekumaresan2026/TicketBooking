package com.company.TicketBookingSystem;

import java.util.Scanner;

public class TicketReservationCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Routes route = new Routes();
        route.routeList();
        System.out.println();
        System.out.print("enter you Source :");
        String source = keyboard.nextLine();
        System.out.print("enter you destination :");
        String destination = keyboard.nextLine();
    }
}
