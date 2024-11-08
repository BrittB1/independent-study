package com.pluralsight;

//declaring a class that handles restaurant reservations
public class Reservation {

    // Declaring variables at the class level
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    // Constructor (always has same name as class) for initializing the Reservation object
    public Reservation(int count, int capacity, boolean open) {
        if (count < 1 || count > 8) {
            System.out.println("Invalid reservation!");

        }
        guestCount = count;
        restaurantCapacity = capacity;
        isRestaurantOpen = open;

    }

    // Method to confirm the reservation
    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed");
            isConfirmed = true;
        } else {
            System.out.println("Reservation denied");
            isConfirmed = false;
        }
    }

    // Method to inform the user about the reservation status
    public void informUser() {
        if (!isConfirmed) {
            System.out.println("Cannot confirm reservation, please contact restaurant \uD83D\uDE25");
        } else {
            System.out.println("Please enjoy your meal! 😄");
        }
    }

    // Very important! main method goes at the end and is needed to test code. This is what prints a result to the screen
    public static void main(String[] args) {
        // Create a Reservation object with 4 guests, capacity of 10, and the restaurant is open
        Reservation reservation = new Reservation(4, 10, false);
        reservation.confirmReservation(); // Try to confirm the reservation
        reservation.informUser(); // Inform the user about the reservation status
    }
}