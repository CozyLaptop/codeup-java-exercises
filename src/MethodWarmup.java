public class MethodWarmup {
    //    Gets the difference of the highest number and the lowest number
    private static int getDifference(int num1, int num2) {
        return Math.max(num1, num2) - Math.min(num1, num2);
    }

    //    Gets difference of the number and 0. Can take in to account negative numbers if 0 is higher
    private static int getDifference(int num1) {
        return Math.max(num1, 0) - Math.min(num1, 0);
    }

    //    Gets difference in double format
    private static double getDifference(double double1, double double2) {
        return Math.max(double1, double2) - Math.min(double1, double2);
    }

    public static void main(String[] args) {
        System.out.println(getDifference(2, 10));
        System.out.println(getDifference(-6));
        System.out.println(getDifference(5.5, 4.1));
        System.out.println("------------");
        System.out.println(addNums(5));
    }
    // TODO: use recursion to add all numbers up, from 1 to the given number input
    /*
        addNums(5) would trigger a calculation of...
            5 + 4 + 3 + 3 + 1, evaluating to 15
     */
    private static int addNums(int num) {
        if (num == 1){
            return 1;
        }
        return addNums(num - 1) + num;
    }
}
