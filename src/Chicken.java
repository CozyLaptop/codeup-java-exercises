public class Chicken {
    private String name;
    private String sound;
    int eggCount;
    public void makeNoise(){
//        System.out.println(name + " says: " + Quote.randomQuote());
        System.out.println(sound);
    }
    public void layEgg(){
        System.out.println("You laid an egg");
        eggCount++;
        System.out.println("You have " + eggCount + " eggs.");
    }
    public Chicken(String name, String sound){
        this.name = name;
        this.sound = sound;
        System.out.println(sound);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSound(String sound){
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }
}
