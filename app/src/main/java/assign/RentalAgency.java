import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalAgency {
    private List<Vehicle> fleet;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental() && customer.isEligibleForRental()) {
            ((Rentable) vehicle).rent(customer, days); // Cast to Rentable
            customer.addRental(vehicle);
            transactions.add(new RentalTransaction(customer, vehicle, days));
        }
    }

    public void returnVehicle(Customer customer, Vehicle vehicle) {
        ((Rentable) vehicle).returnVehicle(); // Cast to Rentable
        customer.returnRental(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return fleet.stream().filter(Vehicle::isAvailableForRental).collect(Collectors.toList());
    }

    public List<RentalTransaction> getTransactions() {
        return transactions;
    }
}
