public class Chicken {
    String name;
    String sound;
    int eggCount;
    public void makeNoise(){
        System.out.println(name + " says: " + Quote.randomQuote());
    }
    public void layEgg(){
        System.out.println("You laid an egg");
        eggCount++;
        System.out.println("You have " + eggCount + " eggs.");
    }
}
