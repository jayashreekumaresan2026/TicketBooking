package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Passenger userInput(String source, String destination) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("enter your name :");
        String name = keyboard.nextLine();
        System.out.print("enter your age :");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.print("enter your gender :");
        String gender = keyboard.nextLine();
        Passenger passengerDetail = new Passenger(name, age, gender, source, destination);
        return passengerDetail;
    }

    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        DisplayDetails details =new DisplayDetails();
        ArrayList<String> routes = new ArrayList<>(Arrays.asList("Tambaram", "Sanatorium", "Chrompet", "Tirusulam", "Meenambakkam"));
        details. listOfRoutes(routes);
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
            Passenger passengerDetails = Main.userInput(source, destination);
            passengers.add(passengerDetails);
        }
        details.displayPassengerDetails(passengers);
    }

}

