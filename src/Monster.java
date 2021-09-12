public class Monster {
    private String monsterName;
    int monsterHealth;
    int monsterXp;
    public Monster(String name, int health, int xp) {
        monsterName = name;
        monsterHealth = health;
        monsterXp = xp;
    }
    public String getMonsterName() {
        return monsterName;
    }
}
