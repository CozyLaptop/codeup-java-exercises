import org.w3c.dom.ls.LSOutput;

public class ProductTest {
    public static double findAveragePrice(Product[] products){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPriceInCents();
        }
        return totalPrice / products.length;
    }
    public static void main(String[] args) {
            /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 2.19);
        products[1] = new Product("Eggs", 3.12);
        products[2] = new Product("Yogurt", 0.99);
        products[3] = new Product("Reeses", 1.08);
        products[4] = new Product("Dog Food", 12.98);
        System.out.println("Average price is: ");
        System.out.printf("$%.2f", findAveragePrice(products));
    }
}
