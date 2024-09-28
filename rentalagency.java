import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Methods for managing cars, customers, and transactions
    public void addCar(Car car) { cars.add(car); }
    public void addCustomer(Customer customer) { customers.add(customer); }
    public void rentCar(Customer customer, Car car) {
        // Implement rental logic here
    }
    public void returnCar(Car car) {
        // Implement return logic here
    }
    public void addTransaction(RentalTransaction transaction) { transactions.add(transaction); }
}