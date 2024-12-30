import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency rentalAgency = new RentalAgency();

        // Add vehicles to the fleet
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        Vehicle motorcycle = new Motorcycle("M001", "Yamaha R1", 30);
        Vehicle truck = new Truck("T001", "Ford F-150", 80);

        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(motorcycle);
        rentalAgency.addVehicle(truck);

        // Create a customer
        Customer customer = new Customer("CU001", "John Doe");

        // Process rentals
        rentalAgency.processRental(customer, car, 5);
        rentalAgency.processRental(customer, motorcycle, 3);

        // Display available vehicles
        List<Vehicle> availableVehicles = rentalAgency.getAvailableVehicles();
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getModel());
        }

        // Return a vehicle
        rentalAgency.returnVehicle(customer, car);

        // Display rental transactions
        List<RentalTransaction> transactions = rentalAgency.getTransactions();
        System.out.println("Rental Transactions:");
        for (RentalTransaction transaction : transactions) {
            System.out.println("Customer: " + transaction.getCustomer().getName() +
                               ", Vehicle: " + transaction.getVehicle().getModel() +
                               ", Days: " + transaction.getRentalDays() +
                               ", Cost: " + transaction.getRentalCost());
        }
    }
}
