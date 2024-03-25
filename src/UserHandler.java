import interfaces.UserHandlerMethods;
import pojos.User;

import java.util.ArrayList;

public class UserHandler implements UserHandlerMethods {
    User user = null;
    @Override
    public void addUsers() {
        user = new User("TestUser1", 9900990099L);
        System.out.print("Booking User Details "+ user);

    }

    @Override
    public User getUsers() {
        return user;
    }
}
