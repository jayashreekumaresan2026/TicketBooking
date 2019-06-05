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
    boolean isChild() {
        if (age <= 12) {
            return true;
        } else {
            return false;
        }
    }
    boolean isAgedPerson(){
       if (age >= 60) {
           return true;
       }
       else {
           return false;
       }
    }
    @Override
    public String toString() {
        String  passenger="";
        passenger= name+ " \t" + age + "   \t" + gender+ "\n";
        return passenger;
    }

}
