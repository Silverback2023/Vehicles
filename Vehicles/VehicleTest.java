public class VehicleTest {

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Hilux", "Toyota", 4, 160);
        System.out.println("My vehicle is a " + myVehicle.getMake() + " " + myVehicle.getModel() + " with " + myVehicle.getNumberOfWheels() + " wheels and a top speed of " + myVehicle.getTopSpeed() + " mph.");
    }
}