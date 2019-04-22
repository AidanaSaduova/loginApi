package helper;

import io.ebean.Expr;
import io.ebean.Finder;
import models.User;

public class UserFinder extends Finder<Long, User> {

    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_USERNAME = "username";

    public UserFinder() {
      super(User.class);
    }

    public User byEmailOrName(String name){
        return query().where().or(Expr.eq(FIELD_EMAIL, name), Expr.eq(FIELD_USERNAME, name)).findOne();
    }


}
