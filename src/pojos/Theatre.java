package pojos;

import java.util.ArrayList;
import java.util.Arrays;

public class Theatre {
    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreAddress() {
        return theatreAddress;
    }

    public void setTheatreAddress(String theatreAddress) {
        this.theatreAddress = theatreAddress;
    }

    public ArrayList<Movie> getMoviesRunning() {
        return moviesRunning;
    }

    public void setMoviesRunning(ArrayList<Movie>  moviesRunning) {
        this.moviesRunning = moviesRunning;
    }

    private String theatreName;
    private String theatreAddress;
    private ArrayList<Movie> moviesRunning;

    public ArrayList<Screen> getAvailableScreenTypes() {
        return availableScreenTypes;
    }

    public void setAvailableScreenTypes(ArrayList<Screen> availableScreenTypes) {
        this.availableScreenTypes = availableScreenTypes;
    }

    private ArrayList<Screen> availableScreenTypes;
}
