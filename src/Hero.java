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
    public void makeNoise(){

    }

    public String getName() {
        return name;
    }

    public void getSound() {
//        return sound;
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
}
