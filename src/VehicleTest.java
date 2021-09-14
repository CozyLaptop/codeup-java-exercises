public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Audi myAudi = new Audi();
        vehicle.setName("Generic Vehicle");
        System.out.println(vehicle.getName());
        vehicle.makeNoise();

        myAudi.setName("Addy");
        System.out.println(myAudi.getName());
        vehicle.makeNoise();
    }

}
