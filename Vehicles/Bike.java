public class Bike extends Vehicle {
    private String engine;

    public Bike(String model, String make, int numberOfWheels, int topSpeed, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public void accelerate() {
        System.out.println("Accelerating the bike");
    }

    public void brake() {
        System.out.println("Applying brakes to the bike");
    }
}

public class Cycle extends Vehicle {
    public Cycle(String model, String make, int numberOfWheels) {
        super(model, make, numberOfWheels, 0);
    }
}