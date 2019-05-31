package com.company.TicketBookingSystem;


class Passenger {
    private String name;
    private String gender;
    private int age;

    Passenger(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getGender() {
        return this.gender;
    }

    String checkPassengerAge() {
        String category = " ";
        if (age <= 12 || age >= 60) {
            category = "halfTicket";
            return category;
        } else {
            category = "fullTicket";
            return category;
        }
    }
}
