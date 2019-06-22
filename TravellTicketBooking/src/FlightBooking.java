public class FlightBooking extends Booking{

    @Override
    public void setModeOfTransport() {
        modeOfTransport = "Flight";
    }

    @Override
    public void login(Customer customer) {
        System.out.println("Customer login succesfull");
    }



}
