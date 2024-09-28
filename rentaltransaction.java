public class RentalTransaction {
    private Customer customer;
    private Car car;
    private String rentalDate;
    private String returnDate;

    public RentalTransaction(Customer customer, Car car, String rentalDate, String returnDate) {
        this.customer = customer;
        this.car = car;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }

    // Getters and setters
    public Customer getCustomer() { return customer; }
    public Car getCar() { return car; }
    public String getRentalDate() { return rentalDate; }
    public String getReturnDate() { return returnDate; }
}