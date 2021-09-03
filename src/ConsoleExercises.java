import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
//        Prints out "Value of pi is approximately : 3.14"
        System.out.printf("Value of pi is approximately : %.2f", pi);
//        Grab Scanner
        Scanner scanner = new Scanner(System.in);
//        Ask to enter a number
        System.out.print("\nEnter a number: ");
//        Enter a number here
        int userInput = scanner.nextInt();
//        Print your number
        System.out.println("Your number is: " + userInput);
//        Prompt to enter 3 words
        System.out.print("Enter 3 words: ");
//        Grabs the 3 tokens(words)
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
//        Prints out words(tokens)
        System.out.println(word1 + word2 + word3);
//        Clear out scanner (has a hidden \n)
        scanner.nextLine();
//        Print an entire sentence with next line
        System.out.print("Enter something: ");
        String userInput1 = scanner.nextLine();
        System.out.println("You entered: --> \"" + userInput1 + "\" <--");

        System.out.print("Length: ");
        int lengthInFeet = Integer.parseInt(scanner.nextLine());
        System.out.print("Width: ");
        int widthInFeet = Integer.parseInt(scanner.nextLine());
        int area = widthInFeet * lengthInFeet;
        int perimeter = 2 * (widthInFeet + lengthInFeet);
        System.out.printf("Area: %d sq feet. Perimeter: %d feet", area, perimeter);

    }
}
