public class Truck extends Vehicle {
    private boolean airConditioning;
    private boolean handbrake;
    private String soundSystem;
    private String engine;
    private String container;

    public Truck(String model, String make, int numberOfWheels, int topSpeed, boolean airConditioning, boolean handbrake, String soundSystem, String engine, String container) {
        super(model, make, numberOfWheels, topSpeed);
        this.airConditioning = airConditioning;
        this.handbrake = handbrake;
        this.soundSystem = soundSystem;
        this.engine = engine;
        this.container = container;
    }

    public void openContainer() {
        System.out.println("Opening the container of the truck");
    }

    public void accelerate() {
        System.out.println("Accelerating the truck");
    }

    public void handbrake() {
        System.out.println("Applying handbrake to the truck");
    }
}