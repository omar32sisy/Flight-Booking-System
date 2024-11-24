package coe528.lab1;

public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    private static int ticketCounter = 0;

    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        ticketCounter++;
        this.number = ticketCounter;
    }

    /**
     * Gets the passenger associated with this ticket.
     *
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the passenger for this ticket.
     *
     * @param passenger the passenger to set
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * Gets the flight associated with this ticket.
     *
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Sets the flight for this ticket.
     *
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * Gets the price of the ticket.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the ticket.
     *
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the ticket number.
     *
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the ticket number.
     *
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Gets the current ticket counter.
     *
     * @return the ticketCounter
     */
    public static int getTicketCounter() {
        return ticketCounter;
    }

    /**
     * Sets the ticket counter.
     *
     * @param ticketCounter the ticketCounter to set
     */
    public static void setTicketCounter(int ticketCounter) {
        Ticket.ticketCounter = ticketCounter;
    }

    @Override
    public String toString() {
        return passenger.getName() + flight + ", your ticket's price: " + price + "$";
    }
}
