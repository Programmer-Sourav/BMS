package interfaces;

import pojos.Seat;

import java.util.ArrayList;

public interface SeatHandlerMethods {
    public ArrayList<Seat> getAvailableSeats();
    public void setSeatSelectedByUser();
    public int getCurrentAvailableSeatCount();
}
