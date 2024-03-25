package pojos;

import java.util.ArrayList;
import java.util.HashMap;

public class Screen {
    private String screenName;
    private String screenType;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public ArrayList<HashMap<Screen,Seat>> getSeatsInfoForTheScreen() {
        return seatsInfoForTheScreen;
    }

    public void setSeatsInfoForTheScreen(ArrayList<HashMap<Screen, Seat>> seatsInfoForTheScreen) {
        this.seatsInfoForTheScreen = seatsInfoForTheScreen;
    }

    public Screen(String screenName, String screenType) {
        this.screenName = screenName;
        this.screenType = screenType;
    }

    public Screen(){

    }

    private ArrayList<HashMap<Screen,Seat>> seatsInfoForTheScreen;


}
