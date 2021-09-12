import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'y' to start.");
        if (sc.nextLine().equals("y")){
            System.out.println("What is your name?");
            String name = sc.nextLine();
            StartBattle(name);
        } else {
            System.out.println("Farewell, adventurer.");
        }
    }
    private static void StartBattle(String name){
        System.out.println(name + ", something is nearby..");
        Monster randomMonster;
        int randomMonsterId = (int) Math.floor(Math.random() * 3 + 1);
        if (randomMonsterId == 1){
            randomMonster = new Monster("SLIME", 10, 6);
        } else if (randomMonsterId == 2){
            randomMonster = new Monster("ORC", 20, 120);
        } else {
            randomMonster = new Monster("DRAGON", 1000, 5326);
        }
        System.out.println("You've encountered a " + randomMonster.monsterName);
        System.out.println("What");
    }
}
