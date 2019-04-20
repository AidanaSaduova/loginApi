package handler;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.mvc.Http;
import play.mvc.Result;

import java.io.IOException;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

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



        UserViewModel user = new UserViewModel();

        return ok();
    }
}
