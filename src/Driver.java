public class Driver extends Account {
    private int driverID;
    private Vehicle vehicle;
    private int driverLicenseNumber;
    private DriverStatus driverStatus;

    public Driver(String firstName, String lastName, String emailAddress, int phoneNumber, int driverID, Vehicle vehicle, int driverLicenseNumber, DriverStatus driverStatus) {
        super(firstName, lastName, emailAddress, phoneNumber);
        this.driverID = driverID;
        this.vehicle = vehicle;
        this.driverLicenseNumber = driverLicenseNumber;
        this.driverStatus = driverStatus;
    }

    public int getDriverID() {
        return driverID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public DriverStatus getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(DriverStatus driverStatus) {
        this.driverStatus = driverStatus;
    }

    public void updateProfile() {
        // Implement profile update logic
    }

    public void acceptRide() {
        // Implement ride acceptance logic
    }

    public void updateDriverStatus() {
        // Implement driver status update logic
    }

    public void completedRide() {
        // Implement ride completion logic
    }
}
