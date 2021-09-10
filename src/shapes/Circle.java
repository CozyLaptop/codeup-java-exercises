package shapes;

public class Circle {
    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public double getArea(){
        return 3.14 * (radius * 2);
    }
    public double getCircumference(){
        return radius * 3.14 * 2;
    }
}
