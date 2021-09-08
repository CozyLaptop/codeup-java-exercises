import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {
        String feeling;
        do {
            System.out.println("How are you doing today? (Good or bad?)");
            Scanner scanner = new Scanner(System.in);
            feeling = scanner.nextLine().toLowerCase();
            if (feeling.equals("good")) {
                System.out.println("Great, keep it up!");
            } else if (feeling.equals("bad")) {
                System.out.println("Not a good answer, try again");
            } else {
                System.out.println("I don't know what that is");
            }
        } while (!feeling.equals("good")) ;
    }
}
