public class MovieTest {
    public static void main(String[] args) {
        Comedy movie = new Comedy("Test name", "Test Director", true);
        System.out.println(movie);
        System.out.println(movie.getDirector());
        System.out.println(movie.getName());
        System.out.println(movie.isFunny());
    }
}
