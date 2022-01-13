public class Monster {
    private String monsterName;
    private int monsterHealth;
    private int monsterMaxHealth;
    private int monsterXp;
    private boolean hasBeenExamined;

    public Monster(String name, int health, int xp) {
        monsterName = name;
        monsterHealth = health;
        monsterMaxHealth = health;
        monsterXp = xp;
    }
    public String getMonsterName() {
        return monsterName;
    }
    public int attack(){
        int damage = 3;
        System.out.println(this.monsterName + " does " + damage + " damage!");
        return damage;
    }
    public void takeDamage(int damage){
        monsterHealth -= damage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }

    public int getMonsterMaxHealth(){
        return monsterMaxHealth;
    }

    public int getMonsterXp() {
        return monsterXp;
    }

    public boolean randomPotionGetter(){
        return Math.floor(Math.random() * 10 + 1) <= 3;
    }

    public boolean getHasBeenExamined(){
        return hasBeenExamined;
    }

    public void setHasBeenExamined(){
        hasBeenExamined = true;
    }
}
