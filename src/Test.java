import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
        String myString = "Hello Draco";
        System.out.println(myString);
        float myNumber = 3;
        System.out.println(myNumber);
/*
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
*/
//        int x = 4;
//        x += 5;
        int x = 3;
        int y = 4;
        x *= y;
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}