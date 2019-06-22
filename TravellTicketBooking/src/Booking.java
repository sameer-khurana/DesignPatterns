
public abstract class Booking {

    protected String modeOfTransport;

    //Method stub or skeleton of operations for booking
    public final void bookTicket(Customer customer) {

        login(customer);
        setModeOfTransport();
        selectFrom();
        selectDestination();
        selectTimeFrom();
        selectTimeDestintion();
        payment();
    }


    public void selectFrom() {
        System.out.println("Selecting from");
    }


    public  void selectDestination(){
        System.out.println("Selecting destination");
    }

    public void selectTimeFrom(){
        System.out.println("Selecting from time");
    }

    public void selectTimeDestintion(){
        System.out.println("Selecting destination time");

    }

    public  void payment(){
        System.out.println("Payment done");
    }

    public  String getModeOfTransport(){
        return modeOfTransport;
    }
    public abstract void setModeOfTransport();

    public abstract void login(Customer customer);
}