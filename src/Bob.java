import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Ask Bob a question");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine().toLowerCase();
        if (answer.endsWith("?")) {
            System.out.println("Sure");
        } else if (answer.endsWith("!")) {
            System.out.println("Woah, chill out!");
        } else if (answer.isEmpty() | answer.equals("")) {
            System.out.println("Fine be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
