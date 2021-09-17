package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
//    Constructors
    public Quadrilateral(){

    }
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
//    Getters and Setters
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);

}
