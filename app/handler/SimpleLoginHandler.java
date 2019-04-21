package handler;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import services.UserService;

import java.io.IOException;

import static play.mvc.Results.*;

public class SimpleLoginHandler extends LoginHandler {

    private final ObjectMapper mapper;

    public SimpleLoginHandler(ObjectMapper mapper) {
        super();
        this.mapper = mapper;
    }

    @Override
    public Result verifyLogin(Http.Request request) throws IOException {

        JsonNode node = request.body().asJson();
        UserLoginApiForm form = mapper.readValue(node.toString(),UserLoginApiForm.class);

        if(form.hasErrors()){
            return badRequest(form.errorsAsJson());
        }

        UserService us = new UserService();
        User user = us.findByEmailorUsername(form.getName());
        if(user==null){

            return notFound();
        }
        if(us.checkPassword(user, form.getPassword())){
            return badRequest();
        }

        UserViewModel u = new UserViewModel(user);
        return ok(Json.toJson(u));
    }
}
