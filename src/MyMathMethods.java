import java.util.ArrayList;
import java.util.List;

public class MyMathMethods {
    public static int multiply(int int1, int int2){
        return int1 * int2;
    }
    public static double multiply(double double1,double double2){
        return double1 * double2;
    }
    public static double quotient(double num1, double num2){
        return num1/num2;
    }
    public static double sum(List<Integer> nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("Your sum is: ");
        return sum;
    }
}
