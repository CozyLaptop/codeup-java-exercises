package shapes;

public class Square extends Quadrilateral implements Measurable{
    @Override
    public double getPermiter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }
//    public Square(int side){
//        length = side;
//        width = side;
//    }
//    public int getArea() {
//        return length * length;
//    }
//    public int getPerimeter(){
//        return length * 4;
//    }
}
