package pojos;

import java.util.HashMap;

public class Orders {
    private Movie movieDetails;

    public Movie getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(Movie movieDetails) {
        this.movieDetails = movieDetails;
    }

    public HashMap<String, Movie> getUserWithMovieAssociation() {
        return userWithMovieAssociation;
    }

    public void setUserWithMovieAssociation(HashMap<String, Movie> userWithMovieAssociation) {
        this.userWithMovieAssociation = userWithMovieAssociation;
    }

    private HashMap<String, Movie> userWithMovieAssociation;


}
