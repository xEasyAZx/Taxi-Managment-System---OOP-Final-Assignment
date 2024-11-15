public class Customer extends Account{
    private int customerID;
    private Location location;

    public Customer(String firstName, String lastName, String emailAddress, int phoneNumber, int customerID, Location location) {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.customerID = customerID;
        this.location = location;
    }

    public int getCustomerID() {
        return customerID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
