public class Audi extends Vehicle{
    public void makeNoise() {
        System.out.println("Vroom vroom!");
    }
    public void breakDown(){
        super.makeNoise();
        System.out.println("Uh oh, whats that sound??");
    }
}
