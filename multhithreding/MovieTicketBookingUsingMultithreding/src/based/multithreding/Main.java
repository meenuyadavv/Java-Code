package based.multithreding;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Book Ticket\n2. Cancel Ticket\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter number of tickets: ");
                    int seats = sc.nextInt();

                    // Har booking ke liye naya thread create karo
                    TicketCounter booking = new TicketCounter(name, seats);
                    booking.start(); // Thread start karega `run()` method call
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancelSeats = sc.nextInt();
                    System.out.println(TicketCounter.cancelTicket(cancelSeats)); // Static method ko class se call karo
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
