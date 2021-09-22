import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyMathMethodsTest {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an int: ");
        int int1 = sc.nextInt();
        System.out.println("Enter another int: ");
        int int2 = sc.nextInt();
        System.out.println(MyMathMethods.multiply(int1, int2));

        System.out.println("Enter a double(decimal number): ");
        double double1 = sc.nextDouble();
        System.out.println("Enter another double(decimal number): ");
        double double2 = sc.nextDouble();
        System.out.println(MyMathMethods.multiply(double1, double2));
        System.out.println(MyMathMethods.quotient(10,2));
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(MyMathMethods.sum(nums));
    }
}
