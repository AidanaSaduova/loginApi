package services;

import helper.UserFinder;
import io.ebean.Expr;
import io.ebean.Finder;
import models.User;
import org.mindrot.BCrypt;

public class UserService {

    private static UserFinder find = new UserFinder();
    private static Finder<Long,User> finder = new Finder<Long, User>(User.class);
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_USERNAME = "username";


    public User findByEmailorUsername(String name){

        //return find.byEmailOrName(name);
        return finder.query().where().or(Expr.eq(FIELD_EMAIL,name), Expr.eq(FIELD_USERNAME,name)).findOne();

    }

    public boolean checkPassword(User user, String password){

        return BCrypt.checkpw(password, user.password);
    }
}
