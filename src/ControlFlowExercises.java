import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        use int for 65536 and under
        int i = 5;
        while (i <= 15) {
            System.out.println("i = " + i);
            i++;
        }
        for (i = 5; i <= 15; i++){
            System.out.println("i = " + i);
        }
//        need to use long for numbers over 65536
        long count = 2;
        do {
            System.out.println(count);
            count*=count;
        } while (count < 1000000);
        for (count = 2; count < 1000000; count*=count){
            System.out.println(count);
        }
        count = 0;
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        do {
            System.out.println(count);
            count+=2;
        } while (count < 100);
        System.out.println(count);
        count = 100;
        do {
            System.out.println(count);
            count-=5;
        } while (count > -10);
        System.out.println(count);
        for (int j = 0; j <= 100; j++){
            if (j % 5 == 0 && j % 3 == 0){
                System.out.println("Fizz Buzz");
            } else if (j % 3 == 0){
                System.out.println("Fizz");
            } else if (j % 5 == 0){
                System.out.println("Buzz");
            } else
            System.out.println(j);
        }
        Scanner scanner = new Scanner(System.in);
        boolean userContinue = false;
        do {
            System.out.println("Enter a number");
            int numToGoTo = scanner.nextInt();
            System.out.println("Here is your table:");
            System.out.println("number  | sqaured | cubed");
            System.out.println("------- | ------- | ------");
            for (int k = 1; k <= numToGoTo; k++) {
                System.out.printf("%-7d", k);
                System.out.print(" | ");
                System.out.printf("%-7d", k * k);
                System.out.print(" | ");
                System.out.print(k * k * k);
                System.out.println();
            }
            System.out.println("Input y to continue");
            String userInput = scanner.next();
            userContinue = userInput.equals("y");
        } while (userContinue);

        boolean anotherGrade = false;
        do {
            System.out.println("Please enter a number to grade from 0 - 100: ");
            int userGrade = scanner.nextInt();
            if (userGrade >= 90) {
                System.out.println("Your grade is : A");
            } else if (userGrade >= 80) {
                System.out.println("Your grade is : B");
            } else if (userGrade >= 75) {
                System.out.println("Your grade is : C");
            } else if (userGrade >= 70) {
                System.out.println("Your grade is : D");
            } else {
                System.out.println("Your grade is : F");
            }
            System.out.println("Enter y to enter a new number to grade.");
            String userResponse = scanner.next();
            if (userResponse.equals("y")) {
                anotherGrade = true;
            }
        } while (anotherGrade);

    }
}
