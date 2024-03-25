package interfaces;

import pojos.Screen;
import pojos.Seat;

import java.util.ArrayList;
import java.util.HashMap;

public interface ScreenHandlerMethods {
    public void addSeats(ArrayList<Seat> seats);
    public ArrayList<HashMap<Screen,Seat>> getAllSeats();
    public HashMap<Screen,Seat> getSeatForAParticularScreen();
}
