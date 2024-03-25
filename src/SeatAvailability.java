public class SeatAvailability {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal_seat_booked() {
        return total_seat_booked;
    }

    public void setTotal_seat_booked(int total_seat_booked) {
        this.total_seat_booked = total_seat_booked;
    }

    public int getSeat_available() {
        return seat_available;
    }

    public void setSeat_available(int seat_available) {
        this.seat_available = seat_available;
    }

    private  int total_seat_booked;
    private  int seat_available;
}
