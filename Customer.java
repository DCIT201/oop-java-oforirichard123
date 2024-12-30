import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentalHistory;
    private List<Vehicle> currentRentals;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
        this.currentRentals = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getRentalHistory() {
        return rentalHistory;
    }

    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }

    public boolean isEligibleForRental() {
        return currentRentals.size() < 3; // Example rule: max 3 rentals at a time
    }

    public void addRental(Vehicle vehicle) {
        currentRentals.add(vehicle);
        rentalHistory.add(vehicle);
    }

    public void returnRental(Vehicle vehicle) {
        currentRentals.remove(vehicle);
    }
}
