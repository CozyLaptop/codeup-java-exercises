import java.util.Scanner;

public class ServerNameGenerator {
    public static String getRandomElement(String[] strings){
        return strings[(int) Math.floor(Math.random() * strings.length)];
    }
    public static void main(String[] args) {
        String[] adjectives = {"happy", "hungry", "fast", "blessed", "soft",
                "plastic", "electrified", "black", "blue", "big"};
        String[] nouns = {"doritos", "rock", "water", "flag", "snake",
                "remote","palm","grease","sun","method"};
        String decision;
        do {
            System.out.println("Your server name is: ");
            System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));
            System.out.println("Enter 'y' if you would like another server name.");
            Scanner sc = new Scanner(System.in);
            decision = sc.nextLine();
        } while (decision.equals("y"));
        }
}
