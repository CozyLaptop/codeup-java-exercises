public class MethodsExercises {
    private static int addition(int num1, int num2){
        return num1 + num2;
    }
    private static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    private static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    private static int division(int num1, int num2){
        return num1 / num2;
    }
    private static int modulus(int num1, int num2){
        return num1 % num2;
    }
    public static void main(String[] args) {
        System.out.println(addition(10, 20));
        System.out.println(subtraction(10, 20));
        System.out.println(multiplication(10, 20));
        System.out.println(division(10, 20));
        System.out.println(modulus(10, 20));
    }
}
