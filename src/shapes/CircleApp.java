package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What's the radius of your circle?");
        Input input = new Input();
        Circle circle = new Circle(input.getInt());
    }
}
