package handler;

import play.mvc.Http;
import play.mvc.Result;

import java.io.IOException;

public class LoginHandler implements ILoginHandler{

    public LoginHandler() {
        super();
    }

    @Override
    public Result verifyLogin(Http.Request request) throws IOException {
        return null;
    }
}
