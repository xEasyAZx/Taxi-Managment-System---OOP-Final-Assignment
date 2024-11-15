public class Vehicle {
    //Attributes
    private String brand;
    private String model;
    private int year;
    private String registrationNumber;
    private FuelType fuelType;
    private boolean insuranceStatus;
    private Location location;

    //Constructor
    public Vehicle(String brand, String model, int year, String registrationNumber, FuelType fuelType, boolean insuranceStatus, Location location) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.insuranceStatus = insuranceStatus;
        this.location = location;
    }

    //Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public FuelType getFuelType() {
        return fuelType;
    }
    public boolean getInsuranceStatus() {
        return insuranceStatus;
    }
    public Location getLocation() {
        return location;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }
    public void setInsuranceStatus(boolean insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
}
