public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int rentalDays;
    private double rentalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalCost = vehicle.calculateRentalCost(rentalDays);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getRentalCost() {
        return rentalCost;
    }
}
