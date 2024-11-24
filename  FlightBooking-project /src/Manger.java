
package coe528.lab1;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;


public class Manger {
    ArrayList<Flight> flights = new ArrayList<>();
    ArrayList<Ticket> issuedTickets = new ArrayList<>();

    public static void main(String args[]) {
        try (Scanner scan = new Scanner(System.in)) {
            String name, member, origin, destination, book;
            int age, flightNumber, membershipYears;
            Passenger passenger;
            Manger airCanada = new Manger();
            airCanada.createFlights();

            while (true) {
                System.out.print("Please enter the name followed by the age: ");
                name = scan.next();
                age = scan.nextInt();
                System.out.print("Are you a member? y,n: ");
                member = scan.next();
                if (member.equals("y")) {
                    System.out.print("Welcome back!\nHow many years have you been with us?: ");
                    membershipYears = scan.nextInt();
                    passenger = new Member(name, age, membershipYears);
                } else if (member.equals("n")) {
                    passenger = new NonMember(name, age);
                } else {
                    System.out.println("You did not enter a valid answer, try again.");
                    continue;
                }

                System.out.print("Please enter the origin followed by your destination: ");
                origin = scan.next();
                destination = scan.next();
                airCanada.displayAvailableFlights(origin, destination);
                System.out.print("Please enter the flight number you want to book: ");
                flightNumber = scan.nextInt();
                if (airCanada.getFlight(flightNumber) != null) {
                    airCanada.bookASeat(flightNumber, passenger);
                } else {
                    System.out.println("The Flight number you entered is not valid, try again.");
                }
                System.out.print("Want to book a ticket for another person? y or n: ");
                book = scan.next();
                if (!book.equals("y")) {
                    System.out.println("Thank you!");
                    break;
                }
            }
        }
    }

    public void createFlights() {
        try {
            flights.add(new Flight(130, "Toronto", "Berlin", "10/20/2024 10:40 AM", 125, 1000));
            flights.add(new Flight(120, "Cairo", "Bali", "10/30/2024 8:00 AM", 145, 2000));
            flights.add(new Flight(110, "Paris", "California", "10/25/2024 9:00 PM", 160, 3000));
            flights.add(new Flight(140, "Toronto", "Berlin", "10/20/2024 3:30 PM", 155, 1500));
            flights.add(new Flight(170, "Cairo", "Bali", "11/30/2024 9:00 AM", 185, 1250));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            exit(-1);
        }
    }

    public void displayAvailableFlights(String origin, String destination) {
        boolean foundFlight = false;
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                for (Flight flight : flights) {
                    if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination) && flight.getNumberOfSeatsLeft() > 0) {
                        if (!foundFlight) {
                            System.out.println("The available flights are:");
                        }
                        foundFlight = true;
                        System.out.println(flight);
                    }
                }
                if (!foundFlight) {
                    System.out.println("There are no flights available for the given origin and destination, try again.");
                    System.out.print("Please enter the origin followed by your destination: ");
                    origin = scan.next();
                    destination = scan.next();
                } else {
                    break;
                }
            }
        }
    }

    public Flight getFlight(int flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber() == flightNumber) {
                return flight;
            }
        }
        return null;
    }

    public void bookASeat(int flightNumber, Passenger passenger) {
        Flight flight = this.getFlight(flightNumber);
        if (flight != null) {
            if (flight.bookASeat()) {
                Ticket ticket = new Ticket(passenger, flight, passenger.applyDiscount(flight.getOriginalPrice()));
                issuedTickets.add(ticket);
                if (flight.getOriginalPrice() != passenger.applyDiscount(flight.getOriginalPrice())) {
                    System.out.println("You have booked a ticket on the chosen flight with a discount applied.\nThe ticket details are: " + ticket);
                } else {
                    System.out.println("You have booked a ticket on the chosen flight with no discount applied.\nThe ticket details are: " + ticket);
                }
                System.out.println("Number of seats left on this flight is " + flight.getNumberOfSeatsLeft());
            } else {
                System.out.println("No seats are available on the given flight.");
            }
        } else {
            System.out.println("No flight found for the given flight number, please enter a valid number, run the program again.");
            exit(1);
        }
    }
}
