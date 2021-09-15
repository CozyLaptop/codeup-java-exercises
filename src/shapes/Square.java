package shapes;

public class Square extends Rectangle{
    public Square(int side){
        length = side;
        width = side;
    }
    public int getArea() {
        return length * length;
    }
    public int getPerimeter(){
        return length * 4;
    }
}
