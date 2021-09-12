import java.util.Scanner;

public class AdventureGame {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 'y' to start.");
        if (sc.nextLine().equals("y")){
            System.out.println("What is your name?");
            String name = sc.nextLine();
            Hero hero = new Hero(name, "knight", 10, 10);
            StartBattle(hero);
        } else {
            System.out.println("Farewell, adventurer.");
        }
    }
    private static void StartBattle(Hero hero){
        System.out.println(hero.getName() + ", something is nearby..");
        Monster randomMonster;
        int randomMonsterId = (int) Math.floor(Math.random() * 3 + 1);
        if (randomMonsterId == 1){
            randomMonster = new Monster("SLIME", 10, 6);
        } else if (randomMonsterId == 2){
            randomMonster = new Monster("ORC", 20, 120);
        } else {
            randomMonster = new Monster("DRAGON", 1000, 5326);
        }
        System.out.println(randomMonster.getMonsterName() + " draws near!");
        System.out.println("----------------");
        printBattleScript(hero, randomMonster);
    }
    private static void printBattleScript(Hero hero, Monster randomMonster){
        if (hero.getHP() > 0) {
            System.out.println(hero.getName() + ":" +
                    " HP[" + hero.getHP() + "]" + " MP[" + hero.getMP() + "]" +
                    " [CLAYMORE]");
            System.out.println("COMMANDS: [1]:Attack [2]:Drink Potion [3]Run");
            int command = sc.nextInt();
            if (command == 1) {
                randomMonster.takeDamage(5);
            } else if (command == 2) {

            } else if (command == 3) {

            } else {
                System.out.println("Invalid command!");
                printBattleScript(hero, randomMonster);
            }
            if (randomMonster.getMonsterHealth() <= 0){
                System.out.println("You've killed the " + randomMonster.getMonsterName());
            } else {
                printBattleScript(hero, randomMonster);
            }
        }
    }
}
