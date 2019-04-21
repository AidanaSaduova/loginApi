package services;

import helper.UserFinder;
import models.User;
import org.mindrot.BCrypt;

public class UserService {

    private static UserFinder find = new UserFinder();

    public User findByEmailorUsername(String name){

        return find.byEmailOrName(name);
    }

    public boolean checkPassword(User user, String password){

        return BCrypt.checkpw(password, user.password);
    }
}
