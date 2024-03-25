package pojos;

public class Ticket {
    private int id;
    private long ticketNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(long ticketNo) {
        this.ticketNo = ticketNo;
    }

    public Seat getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(Seat seatInfo) {
        this.seatInfo = seatInfo;
    }

    private Seat seatInfo;

    public Movie getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(Movie movieInfo) {
        this.movieInfo = movieInfo;
    }

    private Movie movieInfo;
}
