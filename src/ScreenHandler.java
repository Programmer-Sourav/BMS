import interfaces.ScreenHandlerMethods;
import pojos.Movie;
import pojos.Screen;
import pojos.Seat;

import java.util.ArrayList;
import java.util.HashMap;

public class ScreenHandler implements ScreenHandlerMethods {

    Screen screen = new Screen("ScreenName1", "MAX");

    @Override
    public void addSeats(ArrayList<Seat> seats) {
        ArrayList<HashMap<Screen, Seat>> screenWithSeatDetails = new ArrayList<>();
        //HashMap<Screen, Seat> seatsHM = new HashMap<>();
        for(Seat seat : seats){
            System.out.print("Seat --- "+ seat);
            HashMap<Screen, Seat> seatsHM = new HashMap<>();
            seatsHM.put(screen, seat);
            screenWithSeatDetails.add(seatsHM);
        }
        for(int i = 0; i<screenWithSeatDetails.size(); i++){
            System.out.print("SwSD "+ screenWithSeatDetails.get(i));
        }
        screen.setSeatsInfoForTheScreen(screenWithSeatDetails);
    }

    @Override
    public ArrayList<HashMap<Screen,Seat>> getAllSeats() {
        return screen.getSeatsInfoForTheScreen();
    }

    @Override
    public HashMap<Screen, Seat> getSeatForAParticularScreen() {
        ArrayList<HashMap<Screen,Seat>> allSeat = new ArrayList<>();
        return null;
    }


}
