import java.util.Scanner;

public class Miniexercises {
    public static void main(String[] args) {
//        1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        System.out.println("Hello");
        System.out.println("Albert");
//        2. Write a Java program to print the sum of two numbers
        float num1 = 20;
        float num2 = 30;
        System.out.println(num1 + num2);
//        3. Write a Java program to divide two numbers and print on the screen);
        float num3 = num1 / num2;
        System.out.println(num3);
//    4. Write a Java program to print the result of the following operations:
//    a. -5 + 8 * 6
//    b. (55+9) % 9
//    c. 20 + -3*5 / 8
//    d. 5 + 15 / 3 * 2 - 8 % 3
//    Expected Output :
//    43
//    1
//    19
//    13
        System.out.println(-5 + 8 * 6);
        System.out.println((55+9) % 9);
        System.out.println(20 + -3*5 / 8);
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//        5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num4 = scanner.nextInt();
        System.out.println("Enter another number");
        int num5 = scanner.nextInt();
        System.out.println(num4 * num5);
    }
}
