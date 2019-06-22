public class Main {
    public static void main(String[] args) {

        Booking trainBooking = new TrainBooking();
        Booking flightBooking  = new FlightBooking();

        Customer trainCustomer = new Customer("Arjun",12345,"Arjun.Reddy");
        Customer flightCustomer = new Customer("Kabir",54321,"Kabir.Singh");

        trainBooking.bookTicket(trainCustomer);
        flightBooking.bookTicket(flightCustomer);

    }
}
