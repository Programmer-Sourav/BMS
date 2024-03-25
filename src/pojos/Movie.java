package pojos;

import java.util.ArrayList;
import java.util.HashMap;

public class Movie {
    private String movieName;
    private int movieId;

    public Movie() {

    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Movie(int movieId, String movieName, String movieDate, String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    private String movieDate;
    private String genre;

    public ArrayList<HashMap<Theatre, Movie>> getMovieRunningOnTheatre() {
        return movieRunningOnTheatre;
    }

    public void setMovieRunningOnTheatre(ArrayList<HashMap<Theatre, Movie>> movieRunningOnTheatre) {
        this.movieRunningOnTheatre = movieRunningOnTheatre;
    }

    private ArrayList<HashMap<Theatre, Movie>> movieRunningOnTheatre;

}
