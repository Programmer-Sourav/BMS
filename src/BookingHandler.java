import interfaces.BookingHandlerMethods;
import pojos.Screen;
import pojos.Seat;
import pojos.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BookingHandler implements BookingHandlerMethods {
    //A user can book multiple seats, so, user with screen to the list of seats are passed in this hashmap
    private ConcurrentHashMap<User, HashMap<String, ArrayList<String>>> bookingsForUser = new ConcurrentHashMap<>();
    @Override
    public void reserveASeatAndConfirmBooking(User user, String screenName1) {
        HashMap<String, ArrayList<String>> seatSelectedHm= new HashMap<>();

        ArrayList<String> selectedSeatNumbers = new ArrayList<>();
        selectedSeatNumbers.add("2A");
        selectedSeatNumbers.add("2B");
        selectedSeatNumbers.add("3B");

        seatSelectedHm.put(screenName1, selectedSeatNumbers);

        bookingsForUser.put(user, seatSelectedHm);
    }

    @Override
    public HashMap<String, Seat> getBookingDetailsForTheUser() {
        System.out.print("\n\n\n ******* Booking Details *******\n\n\n");
        String key = "";
        HashMap<String, ArrayList<String>> value= null;
        for(Map.Entry<User, HashMap<String, ArrayList<String>>> entry : bookingsForUser.entrySet()){
            key = entry.getKey().toString();
            value = entry.getValue();
        }
        System.out.println("User Details: " + key + ", Ticket Details: " + value);
        return null;
    }
}
