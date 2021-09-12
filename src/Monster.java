public class Monster {
    private String monsterName;
    private int monsterHealth;
    int monsterXp;
    public Monster(String name, int health, int xp) {
        monsterName = name;
        monsterHealth = health;
        monsterXp = xp;
    }
    public String getMonsterName() {
        return monsterName;
    }
    public void takeDamage(int damage){
        monsterHealth -= damage;
    }

    public int getMonsterHealth() {
        return monsterHealth;
    }
}
