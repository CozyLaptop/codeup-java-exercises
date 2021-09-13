public class Monster {
    private String monsterName;
    private int monsterHealth;
    private int monsterXp;
    public Monster(String name, int health, int xp) {
        monsterName = name;
        monsterHealth = health;
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

    public int getMonsterXp() {
        return monsterXp;
    }
}
