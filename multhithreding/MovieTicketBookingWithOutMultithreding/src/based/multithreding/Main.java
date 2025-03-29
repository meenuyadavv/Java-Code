package based.multithreding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter();
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("ticket booking according to select option !");
        	System.out.println("----------------------------------");
            System.out.println("\n1. Book Ticket\n2. Cancel Ticket\n3. Check Available Seats\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.next();
                    System.out.print("Enter number of tickets: ");
                    int seats = sc.nextInt();
                    System.out.println(ticketCounter.bookTicket(name, seats));
                    System.out.println("----------------------------------");
                    
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String name1 = sc.next();
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancelSeats = sc.nextInt();
                    System.out.print(ticketCounter.cancelTicket(name1, cancelSeats));
                    System.out.println("----------------------------------");
                    break;

                case 3:
               
                	System.out.println(ticketCounter.getAvailableSeats());
                	System.out.println("----------------------------------");

                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    System.out.println("----------------------------------");

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

	}

}
