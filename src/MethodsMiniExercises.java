import java.util.Scanner;

public class MethodsMiniExercises {
    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        seeIfItMatches();
    }
    private static String stringInput(Scanner sc){
        System.out.println("Please enter an input.");
        return sc.nextLine();
    }
    private static int askForInt(Scanner sc){
        System.out.println("Please enter an integer.");
        return sc.nextInt();
    }
    private static void seeIfItMatches(){
        Scanner sc = new Scanner(System.in);
        if (stringInput(sc).length() == askForInt(sc)) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }
}