package based.multithreding;

public class TicketCounter extends Thread {
    
    private static int totalSeats = 50; // Shared resource
    private int seatsToBook;
    private String customerName;

    // Constructor
    public TicketCounter(String customerName, int seatsToBook) {
        this.customerName = customerName;
        this.seatsToBook = seatsToBook;
    }

    // Synchronized method to prevent race conditions
    public synchronized void bookTicket() {
        if (seatsToBook > totalSeats) {
            System.out.println(customerName + ": Booking failed! Not enough seats available.");
        } else {
            totalSeats -= seatsToBook;
            System.out.println(customerName + ": Ticket booked successfully! Remaining seats: " + totalSeats);
        }
    }

    // Static synchronized method for ticket cancellation
    public static synchronized String cancelTicket(int cancelSeats) {
        if (cancelSeats <= 0) {
            return "Invalid cancellation! You must cancel at least 1 ticket.";
        }

        if (cancelSeats > (50 - totalSeats)) { // Ensure cannot cancel more than booked
            return "Cannot cancel more tickets than booked!";
        }

        totalSeats += cancelSeats; // Seats wapas available ho rahi hain
        return "Cancelled " + cancelSeats + " tickets. Remaining seats: " + totalSeats;
    }

    @Override
    public void run() {
        bookTicket(); // Call synchronized booking method
    }
}
