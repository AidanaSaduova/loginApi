package handler;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import services.UserService;

import javax.inject.Inject;
import java.io.IOException;

import static play.mvc.Results.*;

public class SimpleLoginHandler extends LoginHandler {

    @Inject FormFactory formFactory;

    public SimpleLoginHandler() {
        super();
    }

    @Override
    public Result verifyLogin(Http.Request request) throws IOException {

        //JsonNode node = request.body().asJson();
        Form<UserLoginApiForm> form = formFactory.form(UserLoginApiForm.class).bindFromRequest();


        if(form.hasErrors()){
            return badRequest(form.errorsAsJson());
        }

        UserService us = new UserService();
        User user = us.findByEmailorUsername(form.get().getName());
        if(user==null){

            return notFound();
        }
        if(us.checkPassword(user, form.get().getPassword())){
            return badRequest();
        }

        UserViewModel u = new UserViewModel(user);
        return ok(Json.toJson(u));
    }
}
