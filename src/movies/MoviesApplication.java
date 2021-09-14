package movies;
import util.Input;

public class MoviesApplication {
    public static void displayMovies(Movie[] movies){
        for(Movie movie : movies){
            System.out.println("----------");
            System.out.println(movie.getName());
            System.out.println(movie.getCategory());
        }
    }
    public static void displayMovie(Movie movie){
        System.out.println("----------");
        System.out.println(movie.getName());
        System.out.println(movie.getCategory());
    }
    private static void sortMovies(Movie[] movies, String category) {
        for(Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                displayMovie(movie);
            }
        }
    }
    public static Input input = new Input();
    public static void main(String[] args) {
        System.out.println("Type 'all' to display all movies or enter 'sort' to sort by category");
        String userInput = input.getString();
        if (userInput.equals("all")){
            displayMovies(MoviesArray.findAll());
        } else if (userInput.equals("sort")) {
            System.out.println("Enter 'drama' 'musical' 'scifi' horror' 'comedy' or 'animated'");
            String category = input.getString();
            if (category.matches("drama|musical|scifi|horror|comedy|animated")) {
                sortMovies(MoviesArray.findAll(), category);
            } else {
                System.out.println("Could not find that category!");
                main(args);
            }
        }
    }
}
