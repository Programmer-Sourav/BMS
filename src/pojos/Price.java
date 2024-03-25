package pojos;

public class Price {
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Price(double basePrice, double gst, double someTax) {
        this.basePrice = basePrice;
        this.gst = gst;
        this.someTax = someTax;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getSomeTax() {
        return someTax;
    }

    public void setSomeTax(double someTax) {
        this.someTax = someTax;
    }

    private double basePrice;
    private double gst;
    private double someTax;

    public double calculatePrice(){
        return basePrice + (basePrice *gst)/100 + (basePrice*someTax)/100;
    }
}
