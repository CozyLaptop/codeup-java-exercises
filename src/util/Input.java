package util;

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
    public int getInt(int min, int max){
        System.out.println("Enter a number between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input <= min || input >= max){
            return getInt(min, max);
        }
        return input;
    }
    double getDouble(double min, double max){
        System.out.println("Enter a number between " + min + " and " + max);
        double input = scanner.nextInt();
        if (input <= min || input >= max){
            return getDouble(min, max);
        }
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }
}
