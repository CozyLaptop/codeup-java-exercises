public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
    private String name;
    private double priceInCents;

    public Product(String name, double priceInCents){
        this.name = name;
        this.priceInCents = priceInCents;
    }
    public String getName() {
        return name;
    }
    public double getPriceInCents() {
        return priceInCents;
    }
}
