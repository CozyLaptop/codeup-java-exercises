public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.print("World");
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);
        String myString = "My String";
        myString = "\n";
        System.out.println(myString);
        System.out.println("Test");
//        Int cannot be assigned to String
//        myString = 3,14;
//        long myNumber;
//        not initialized
//        System.out.println(myNumber);
//        not a double
//        myNumber = 3.14;
//        myNumber = 123L;
        float myNumber = 3.14f;
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        String class = "Can't do it";
//        Cannot cast
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        x++;
        x += 5;
        System.out.println("x = " + x);
        x = 3;
        System.out.println("x = " + x);
        int y = 4;
        System.out.println("y = " + y);
        y *= x;
        System.out.println("y = " + y);
        x = 10;
        System.out.println("x = " + x);
        y = 2;
        System.out.println("y = " + y);
        x /= y;
        System.out.println("x = " + x);
        y -= x;
        System.out.println("y = " + y);
    }
}
