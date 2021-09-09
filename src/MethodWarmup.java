public class MethodWarmup {
//    Gets the difference of the highest number and the lowest number
    private static int getDifference(int num1, int num2){
        return Math.max(num1, num2) - Math.min(num1, num2);
    }
//    Gets difference of the number and 0. Can take in to account negative numbers if 0 is higher
    private static int getDifference(int num1){
        return Math.max(num1, 0) - Math.min(num1, 0);
    }
//    Gets difference in double format
    private static double getDifference(double double1, double double2){
        return Math.max(double1, double2) - Math.min(double1, double2);
    }

    public static void main(String[] args) {
        System.out.println(getDifference(2, 10));
        System.out.println(getDifference(-6));
        System.out.println(getDifference(5.5, 4.1));
    }
}
