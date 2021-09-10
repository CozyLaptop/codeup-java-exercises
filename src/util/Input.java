package util;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public String getString(){
        System.out.println("Please enter a string: ");
        return scanner.nextLine();
    }
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    boolean yesNo(){
        System.out.println("Enter yes or y");
        String input = scanner.nextLine().toLowerCase();
        return (input.equals("yes") || input.equals("y"));
    }
    int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input < min || input > max){
            getInt();
        }
        return input;
    }
    int getInt(){
        return getInt(1,10);
    }
    double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double input = scanner.nextInt();
        if (input < min || input > max){
            getDouble();
        }
        return input;
    }
    double getDouble(){
        return getDouble(1, 10);
    }
}
