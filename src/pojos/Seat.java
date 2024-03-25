package pojos;

import java.util.ArrayList;
import java.util.HashMap;

public class Seat {
    private int id;
    private String seatNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatCategory() {
        return seatCategory;
    }

    public void setSeatCategory(String seatCategory) {
        this.seatCategory = seatCategory;
    }

    private String seatCategory;

    public ArrayList<HashMap<String, Price>> getListOfPricesForAllCategoryType() {
        return listOfPricesForAllScreenType;
    }

    public void setListOfPricesForAllCategoryType(ArrayList<HashMap<String, Price>> listOfPricesForAllScreenType) {
        this.listOfPricesForAllScreenType = listOfPricesForAllScreenType;
    }

    private ArrayList<HashMap<String, Price >> listOfPricesForAllScreenType; //I am taking it as screenType will come
    //we need to search seat categories as seat categories will have different prices for different screentype

    public ArrayList<HashMap<String, Price>> getListOfPricesForAllScreenType() {
        return listOfPricesForAllScreenType;
    }

    public void setListOfPricesForAllScreenType(ArrayList<HashMap<String, Price>> listOfPricesForAllScreenType) {
        this.listOfPricesForAllScreenType = listOfPricesForAllScreenType;
    }


    public HashMap<String, Double> getPriceOfSeat() {
        return priceOfSeat;
    }

    public Seat(int id, String seatNo, String seatCategory, HashMap<String, Double> priceOfSeat) {
        this.id = id;
        this.seatNo = seatNo;
        this.seatCategory = seatCategory;
        this.priceOfSeat = priceOfSeat;
    }

    public void setPriceOfSeat(HashMap<String, Double> priceOfSeat) {
        this.priceOfSeat = priceOfSeat;
    }

    private  HashMap<String, Double> priceOfSeat; //seat price for category

    @Override
    public String toString(){
        return this.id+", "+this.seatNo +", "+this.seatCategory+", "+this.priceOfSeat;
    }

    private String seatStatus;
    public void setSeatStatus(String seatStatus) {
        this.seatStatus = seatStatus;
    }

    public String getSeatStatus(){
        return seatStatus;
    }
}
