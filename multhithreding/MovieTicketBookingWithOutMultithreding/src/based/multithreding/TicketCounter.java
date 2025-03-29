package based.multithreding;

public class TicketCounter {
	
	private int totalSeats = 50;

    public String getAvailableSeats() {
        return "Total available seats: " + totalSeats;
    }

    public String bookTicket(String name, int seats) {
        if (seats < 1 || seats > 5) {
            return "Invalid request! " + name + " can book only 1 to 5 tickets.";
        }
        
        if (seats > totalSeats) {
            return "Sorry " + name + ", only " + totalSeats + " seats are available.";
        }
        
        totalSeats -= seats;
        return "Booking confirmed: " + name + " booked " + seats + " tickets. Remaining seats: " + totalSeats;
    }

    public String cancelTicket(String name, int seats) {
        if (seats < 1) {
            return "Invalid cancellation request! " + name + " must cancel at least 1 ticket.";
        }

       // if (totalSeats + seats > 50) {
          //  return "Cancellation failed! " + name + " can't cancel more than booked tickets.";
       // }

        totalSeats -= seats;
        return name + " canceled " + seats + " tickets.  Available seats: " + totalSeats;
    }

}
