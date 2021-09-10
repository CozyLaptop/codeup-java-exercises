package shapes;

public class Circle {
    private double radius;

    public Circle(int radius){
        this.radius = radius;
        System.out.println(getArea());
        System.out.println(getRadius());
        System.out.println(getCircumference());
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public double getArea(){
        return 3.14 * (radius * radius);
    }
    public double getCircumference(){
        return radius * 3.14 * 2;
    }
}
