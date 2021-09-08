import java.util.Scanner;

public class MyTherapist {
    public static void main(String[] args) {
        String feeling;
        do {
            System.out.println("How are you doing today? (Good or bad?)");
            Scanner scanner = new Scanner(System.in);
            feeling = scanner.nextLine().toLowerCase();
            if (feeling.equals("good")) {
//                waits one second
                wait(1000);
                System.out.println("Great, keep it up!");
            } else if (feeling.equals("bad")) {
                System.out.println("Not a good answer, try again");
            } else {
                System.out.println("I don't know what that is");
            }
        } while (!feeling.equals("good")) ;
    }
//    waiting method in ms
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
