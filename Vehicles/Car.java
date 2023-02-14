public class Car extends Vehicle {
    private boolean airConditioning;
    private boolean handbrake;
    private String soundSystem;
    private String engine;

    public Car(String model, String make, int numberOfWheels, int topSpeed, boolean airConditioning, boolean handbrake, String soundSystem, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.airConditioning = airConditioning;
        this.handbrake = handbrake;
        this.soundSystem = soundSystem;
        this.engine = engine;
    }

    public void accelerate() {
        System.out.println("Accelerating the car");
    }

    public void brake() {
        System.out.println("Applying brakes to the car");
    }

    public void handbrake() {
        System.out.println("Applying handbrake to the car");
    }
}