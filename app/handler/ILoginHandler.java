package handler;

import play.mvc.Http;
import play.mvc.Result;

import java.io.IOException;

public interface ILoginHandler {

    public Result verifyLogin(Http.Request request) throws IOException;
}
