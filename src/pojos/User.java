package pojos;

public class User {
    private String fullname;
    private Address address;


    public User(String fullname, long phoneNumber){
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private long phoneNumber;

    @Override
    public String toString(){
        return fullname +", "+phoneNumber;
    }
}
