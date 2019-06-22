public class TrainBooking extends Booking{


    @Override
    public void setModeOfTransport() {
        modeOfTransport = "Train";
    }

    @Override
    public void login(Customer customer) {
        System.out.println("Customer login succesfull");
    }
}
