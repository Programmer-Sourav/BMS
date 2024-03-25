import interfaces.MovieHandlerMethods;
import pojos.Movie;

import java.util.ArrayList;
import java.util.Optional;

public class MovieHandler implements MovieHandlerMethods {



    private ArrayList<Movie> movies = new ArrayList<>();

    @Override
    public void addMovieDetails(Movie movie) {
        movies.add(movie);
        System.out.println("Size after adding movies "+ movies.size());
    }

    @Override
    public Movie getAParticularMovieDetails(int movieId) {
        return movies.stream().filter(movie -> movieId==movie.getMovieId()).findFirst().orElse(null);
    }

    @Override
    public ArrayList<Movie> getAllMovies() {
        return !movies.isEmpty() ? movies : null;
    }
}
