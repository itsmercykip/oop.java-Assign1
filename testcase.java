import org.junit.Test;
import static org.junit.Assert.*;

public class CarRentalSystemTest {
    @Test
    public void testCarCreation() {
        Car car = new Car("1", "Toyota", "Camry", 2020);
        assertEquals("1", car.getId());
        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2020, car.getYear());
    }

    @Test
    public void testCustomerCreation() {
        Customer customer = new Customer("1", "John Doe", "johndoe@example.com");
        assertEquals("1", customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals("johndoe@example.com", customer.getEmail());
    }

    @Test
    public void testRentalAgencyCreation() {
        RentalAgency agency = new RentalAgency();
        assertNotNull(agency.getCars());
        assertNotNull(agency.getCustomers());
        assertNotNull(agency.getTransactions());
    }

}