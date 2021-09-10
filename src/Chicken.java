public class Chicken {
    String name;
    String sound;
    int eggCount;
    public void makeNoise(){
        System.out.println(name + " makes the sound " + sound);
    }
    public void layEgg(){
        System.out.println("You laid an egg");
        eggCount++;
        System.out.println("You have " + eggCount + " eggs.");
    }
}
