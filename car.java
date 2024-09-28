public class Car {
    private String id;
    private String make;
    private String model;
    private int year;
    private boolean isAvailable;

    public Car(String id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
}