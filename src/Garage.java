import java.util.Scanner;

public class Garage {
    private Vehicle[] carsInGarage;
    int numberOfCars = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public Garage(int carsDoesItFit){
        carsInGarage = new Vehicle[carsDoesItFit];
        System.out.println("You now have a " + carsDoesItFit + " car garage.");
    }

    public void putVehicleInGarage(Vehicle vehicle){
        if (numberOfCars == carsInGarage.length){
            System.out.println("You cant fit any more cars! Get a hobby");
        } else {
            carsInGarage[numberOfCars] = vehicle;
            numberOfCars++;
            System.out.println("You added a " + vehicle.getName() + "!");
        }
    }
    public Vehicle[] getCarsInGarage() {
        return carsInGarage;
    }
    private void displayCars() {

        for (Vehicle vehicle : getCarsInGarage()) {
            try {
                System.out.println(vehicle.getName());
            } catch (Exception e) {
                System.out.println("EMPTY SPOT");
            }
        }
    }

    public static void main(String[] args) {
        newGarage();
    }
    private static void newGarage(){
        System.out.println("How many cars do you want to fit?");
        int carsDoesItFit = scanner.nextInt();
        Garage garage = new Garage(carsDoesItFit);
        menu(garage);
    }

    private static void menu(Garage garage) {
        System.out.println("What would you like to do?");
        System.out.println("[1] Add a car");
        System.out.println("[2] See cars in garage");
        System.out.println("[3] New Garage");
        System.out.println("[4] QUIT");
        int input = scanner.nextInt();
        if (input == 1){
            System.out.println("What kind of car do you want to add?");
            System.out.println("[1] Chevy");
            System.out.println("[2] Audi");
            System.out.println("[3] MiniVan");
            System.out.println("[4] CANCEL");
            int carToAdd = scanner.nextInt();
            if (carToAdd == 1){
                garage.putVehicleInGarage(new Chevy());
            } else if (carToAdd == 2){
                garage.putVehicleInGarage(new Audi());
            } else if (carToAdd == 3){
                garage.putVehicleInGarage(new MiniVan());
            } else if(carToAdd == 4){
                menu(garage);
            } else {
                System.out.println("Invalid command!");
            }
        } else if (input == 2){
            garage.displayCars();
        } else if (input == 3){
            newGarage();
        }
        else if (input == 4){
            System.out.println("Be safe out there.");
            return;
        }
        menu(garage);
    }
}
