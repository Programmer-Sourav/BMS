package interfaces;

import pojos.Seat;
import pojos.User;

import java.util.HashMap;

public interface BookingHandlerMethods {
    public void reserveASeatAndConfirmBooking(User users, String screenName1);
    public HashMap<String, Seat> getBookingDetailsForTheUser(); //order details

}
