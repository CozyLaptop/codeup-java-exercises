import java.util.Scanner;

public class AdventureGame {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 'y' to start.");
        if (sc.nextLine().equals("y")){
            System.out.println("What is your name?");
            String name = sc.nextLine();
            Hero hero = new Hero(name, "knight", 20, 10);
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
            randomMonster = new Monster("DRAGON", 100, 5326);
        }
        System.out.println(randomMonster.getMonsterName() + " draws near!");
        System.out.println("----------------");
        printBattleScript(hero, randomMonster);
    }
    private static void printBattleScript(Hero hero, Monster randomMonster){
        if (hero.getHP() > 0) {
            System.out.println(hero.getName() + ":" +
                    " HP[" + hero.getHP() + "/" + hero.getMaxHP() + "]" + " MP[" + hero.getMP() + "]" +
                    " [CLAYMORE]");
            System.out.println("COMMANDS: [1]:Attack [2]:Drink Potion [3]Run");
            int command;
            try{
                command = Integer.parseInt(sc.nextLine());
                if (command == 1) {
                    randomMonster.takeDamage(hero.attack());
                } else if (command == 2) {
                    hero.drinkPotion();
                } else if (command == 3) {
                    int tryToRunAway = (int) Math.floor(Math.random() * 3) + 1;
//                    2/3 chance to run away
                    if (tryToRunAway <= 2){
                        System.out.println("Ran away successfully.");
                        return;
                    } else {
                        System.out.println("Cannot run!");
                    }
                } else {
                    System.out.println("Invalid command!");
                    printBattleScript(hero, randomMonster);
                }
                if (randomMonster.getMonsterHealth() <= 0){
                    System.out.println(hero.getName().toUpperCase() + " killed the " + randomMonster.getMonsterName());
                    System.out.println("You gained " + randomMonster.getMonsterXp() + " experience points!");
                    System.out.println("Would you like to venture further? (Enter 'y' to continue)");
                    if (sc.nextLine().equals("y")) {
                        StartBattle(hero);
                    } else {
                        System.out.println("Thanks for playing, " + hero.getName().toUpperCase() + "!");
                    }
                } else {
                    hero.takeDamage(randomMonster.attack());
                    printBattleScript(hero, randomMonster);
                }
            } catch (Exception e){
                System.out.println("Invalid command!");
                printBattleScript(hero, randomMonster);
            }
        } else {
            System.out.println(hero.getName().toUpperCase() + " passed out.");
        }
    }
}
