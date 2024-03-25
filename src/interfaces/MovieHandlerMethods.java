package interfaces;

import pojos.Movie;

import java.util.ArrayList;

public interface MovieHandlerMethods {
    public void addMovieDetails(Movie movie);
    public Movie getAParticularMovieDetails(int movieId);
    public ArrayList<Movie> getAllMovies();

}
