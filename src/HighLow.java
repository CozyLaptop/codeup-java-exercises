import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int gameRandomNumber = (int) Math.floor(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");
        System.out.println("HINT: It's " + gameRandomNumber);
        int userGuess = sc.nextInt();
        if (userGuess > gameRandomNumber){
            System.out.println("HIGHER");
        } else if (userGuess < gameRandomNumber){
            System.out.println("LOWER");
        } else System.out.println("GOOD GUESS!");
    }
}
