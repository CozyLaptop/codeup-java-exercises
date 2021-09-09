import java.util.Scanner;

public class MethodsExercises {
    public static Scanner sc = new Scanner(System.in);

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
    private static int getInteger(int min, int max){
        System.out.print("Enter a number between " + min + " and " + max + " ");
        int input = sc.nextInt();
        if (input >= min && input <= max){
            return input;
        }
        return getInteger(min, max);
    }
    private static void factorial(){
        System.out.print("Enter a number between 1 and 10: ");
        int input = sc.nextInt();
        System.out.print(input + "! = ");
        System.out.print("1");
        if (input > 1){
            createFactorial(1, input, 1);
        }
    }

    private static void createFactorial(int currentNum, int inputNum, int result) {
        currentNum = currentNum + 1;
        result *= currentNum;
        System.out.print(" x " + currentNum);
        if (currentNum < inputNum){
            createFactorial(currentNum, inputNum, result);
        } else System.out.println(" Result: " + result);
    }
    private static void diceRoll() {
        System.out.println("How many sides on this dice?");
        int sidesOnDice = sc.nextInt();
        int diceResult1 = getRandomNumber(sidesOnDice);
        int diceResult2 = getRandomNumber(sidesOnDice);
        System.out.println(diceResult1);
        System.out.println(diceResult2);
    }

    private static int getRandomNumber(int sidesOnDice) {
        return (int) Math.floor(Math.random() * sidesOnDice);
    }

    public static void main(String[] args) {
        System.out.println(addition(10, 20));
        System.out.println(subtraction(10, 20));
        System.out.println(multiplication(10, 20));
        System.out.println(division(10, 20));
        System.out.println(modulus(10, 20));
        int userInput = getInteger(1, 10);
        System.out.println(userInput);
        factorial();
        diceRoll();
    }
}
