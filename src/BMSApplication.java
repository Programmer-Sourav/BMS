import interfaces.BookingHandlerMethods;
import pojos.Movie;
import pojos.Price;
import pojos.Screen;
import pojos.Seat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BMSApplication {

            MovieHandler movieHandler = new MovieHandler();
            SeatHandler seatHandler = new SeatHandler();
            ScreenHandler screenHandler = new ScreenHandler();
            UserHandler userHandler = new UserHandler();

            BookingHandler bookingHandler = new BookingHandler();
            private ArrayList<Movie> allMovies = getMovieList();
            private Movie myMovie = new Movie();

            public void bmsDemo(){
                addMoviesToList();
                getMovieList();
                showMovieListToUser();
                showAMovieDetails(2);
                addAvailableSeatDetails();
                getAllSeatsForScreens();
                setUser();
                getUserDetails();
                bookingASetByUser();
                printUserBookingDetails();
            }

    private void bookingASetByUser() {
                bookingHandler.reserveASeatAndConfirmBooking(userHandler.getUsers(), "ScreenName1");
    }


    private void getUserDetails() {
                System.out.print("User Details "+ userHandler.getUsers());
    }

    private void addMoviesToList(){
              Movie movie =  new Movie(1, "Jawan", "19-03-2024", "Action");
              Movie movie1 = new Movie(2, "Swadesh", "19-03-2024", "Nationalism");
              Movie movie2 = new Movie(3, "DDLJ", "19-03-2024", "Romance");
              Movie movie3 = new Movie(4, "PK", "19-03-2024", "Drama");
              Movie movie4 = new Movie(5, "Lagaan", "19-03-2024", "Nationalism");
              Movie movie5 = new Movie(6, "Dhoom3", "19-03-2024", "Action");
              movieHandler.addMovieDetails(movie);
              movieHandler.addMovieDetails(movie1);
              movieHandler.addMovieDetails(movie2);
              movieHandler.addMovieDetails(movie3);
              movieHandler.addMovieDetails(movie4);
              movieHandler.addMovieDetails(movie5);
            }
            private ArrayList<Movie> getMovieList(){
                allMovies = movieHandler.getAllMovies();
                return allMovies;
            }
            private void showMovieListToUser(){
                System.out.println("------------ Currently Running Movies -------");
                for(Movie movie : allMovies){
                    System.out.println(movie.getMovieId()+", "+movie.getMovieName()+", "+movie.getMovieDate()+", "+movie.getGenre());
                }
            }
            private void showAMovieDetails(int incomingMovieId){
                System.out.println("------ Info of the Movie you are looking for -------");
                myMovie = movieHandler.getAParticularMovieDetails(incomingMovieId);
                System.out.println("Movie Details "+myMovie.getMovieId()+", " +myMovie.getMovieName()+", "+ myMovie.getMovieDate()+ ", "+myMovie.getGenre());
            }

            private void addAvailableSeatDetails(){
                String categoryOne = "Delux";
                String categoryTwo = "Recliners";
                String categoryThree = "Economy";
                Price priceOne = new Price(1100, 18, 20);
                double priceForCatOne = priceOne.calculatePrice();
                Price priceTwo = new Price(1500, 18, 25);
                double priceForCatTwo = priceTwo.calculatePrice();
                Price priceThree = new Price(800, 18, 18);
                double priceForCatThree = priceThree.calculatePrice();

                HashMap<String, Double> hashMapOne = new HashMap<String, Double>();
                hashMapOne.put(categoryOne, priceForCatOne);
                HashMap<String, Double> hashMapTwo = new HashMap<String, Double>();
                hashMapTwo.put(categoryTwo, priceForCatTwo);
                HashMap<String, Double> hashMapThree = new HashMap<String, Double>();
                hashMapThree.put(categoryThree, priceForCatThree);

                Seat seatOne = new Seat(1, "1A", categoryOne, hashMapOne );
                Seat seatTwo = new Seat(2, "1B", categoryOne, hashMapOne );
                Seat seatThree = new Seat(3, "1C", categoryOne, hashMapOne );
                Seat seatFour = new Seat(4, "2A", categoryOne, hashMapOne );
                Seat seatFive = new Seat(5, "2B", categoryOne, hashMapOne );
                Seat seatSix = new Seat(6, "3A", categoryTwo, hashMapTwo );
                Seat seatSeven = new Seat(7, "3B", categoryTwo, hashMapTwo );
                Seat seatEight = new Seat(8, "3C", categoryTwo, hashMapTwo );
                Seat seatNine = new Seat(9, "4A", categoryThree, hashMapThree );
                Seat seatTen = new Seat(10, "4B", categoryThree, hashMapThree );
                Seat seatEleven = new Seat(11, "5A", categoryThree, hashMapThree );
                Seat seatTwelfth = new Seat(12, "5B", categoryThree, hashMapThree );

                ArrayList<Seat> allSeats = new ArrayList<>();
                allSeats.add(0,seatOne);
                allSeats.add(1,seatTwo);
                allSeats.add(2,seatThree);
                allSeats.add(3,seatFour);
                allSeats.add(4,seatFive);
                allSeats.add(5,seatSix);
                allSeats.add(6,seatSeven);
                allSeats.add(7,seatEight);
                allSeats.add(8,seatNine);
                allSeats.add(9,seatTen);
                allSeats.add(10,seatEleven);
                allSeats.add(11,seatTwelfth);

                screenHandler.addSeats(allSeats);
            }

            private ArrayList<HashMap<Screen, Seat>> getAllSeatsForScreens(){
                ArrayList<HashMap<Screen, Seat>> allSeats = screenHandler.getAllSeats();

                for(HashMap<Screen, Seat> screenSeatHm : allSeats){
                    System.out.println("******Hashmap of Screen with Seat**********");
                    String key = "";
                    Seat value = null;

                    for(Map.Entry<Screen, Seat> entry : screenSeatHm.entrySet()){
                        key = entry.getKey().getScreenName();
                        value = entry.getValue();
                    }
                    System.out.println("Key: " + key + ", Value: " + value);
                }
               return null;
            }
            private void setUser(){
                userHandler.addUsers();
            }

            private void printUserBookingDetails(){
               bookingHandler.getBookingDetailsForTheUser();
            }

}
