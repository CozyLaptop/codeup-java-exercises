public class Hero {
    private String name;
    private String characterClass;
    private int maxHP;
    private int maxMP;
    private int HP;
    private int MP;
    private int XP;
    private int level;

    public Hero(String name, String characterClass, int maxHP, int maxMP){
        this.name = name;
        this.characterClass = characterClass;
        this.maxHP = maxHP;
        this.maxMP = maxMP;
        HP = maxHP;
        MP = maxMP;
        level = 1;
    }

    public String getName() {
        return name;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getMP() {
        return MP;
    }
    public void setMP(int MP) {
        this.MP = MP;
    }
    public int attack(){
//        10% chance for critical hit
        int damage;
        int criticalHitChance = (int) Math.floor(Math.random() * 10 + 1);
        if (criticalHitChance == 1){
            System.out.println("Critical hit!");
            damage = 12;
        } else {
            damage = 5;
        }
        System.out.println(name.toUpperCase() + " does " + damage + " damage!");
        return damage;
    }
    public void takeDamage(int damage){
        HP -= damage;
    }

    public int getMaxHP() {
        return maxHP;
    }
    public void drinkPotion(){
        System.out.println(this.name.toUpperCase() + " drinks a health potion");
        System.out.println("+20 HP");
        HP += 20;
        if (HP > maxHP){
            HP = maxHP;
        }
    }
}
