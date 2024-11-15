import java.time.LocalDateTime;

public class Ride {
    private int rideID;
    private final BookRide booking;
    private double fare;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Ride(int rideID, BookRide booking, double fare, LocalDateTime startTime, LocalDateTime endTime) {
        this.rideID = rideID;
        this.booking = booking;
        this.fare = fare;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getRideID() {
        return rideID;
    }

    public BookRide getBooking() {
        return booking;
    }

    public double getFare() {
        return fare;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setStartTime(){
        this.startTime = LocalDateTime.now();
    }
    public void setEndTime(){
        this.endTime = LocalDateTime.now();
    }
    public void startRide() {
        setStartTime();
        System.out.println("Ride started at: " + this.startTime);
    }

    public void completeRide() {
        setEndTime();
        System.out.println("Ride completed at: " + this.endTime);
    }

    public void cancelRide() {
        this.startTime = null;
        this.endTime = null;
        System.out.println("Ride Canceled");
    }
}
