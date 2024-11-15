import java.time.LocalDateTime;
public class BookRide {
    private int bookingID;
    private Customer customer;
    private Driver driver;
    private Location pickupLocation;
    private Location dropLocation;
    private BookingStatus status;
    private double baseFare;
    private LocalDateTime pickupTime;
    private LocalDateTime dropTime;

    public BookRide(int bookingID, Customer customer, Driver driver, Location pickupLocation, Location dropLocation, BookingStatus status, double baseFare, LocalDateTime pickupTime, LocalDateTime dropTime) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.status = status;
        this.baseFare = baseFare;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
    }

    public int getBookingID() {
        return bookingID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public LocalDateTime getDropTime() {
        return dropTime;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public void cancelRide() {
        // Implement ride cancellation logic
    }

    public void updateStatus() {
        // Implement status update logic
    }
}
