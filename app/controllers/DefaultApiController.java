package controllers;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.User;
import play.Configuration;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.UserService;
import swagger.SwaggerUtils.ApiAction;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-04-20T20:49:34.098+02:00")

public class DefaultApiController extends Controller {

    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;
    private final FormFactory formFactory;


    @Inject
    private DefaultApiController(Configuration configuration, DefaultApiControllerImpInterface imp, FormFactory formFactory) {
        this.imp = imp;
        this.formFactory = formFactory;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result login() throws Exception {

        Form<UserLoginApiForm> form = formFactory.form(UserLoginApiForm.class).bindFromRequest();
        UserLoginApiForm userform = form.bindFromRequest().get();

         if(form.hasErrors()){
            return badRequest(form.errorsAsJson());
        }

        UserService us = new UserService();
        User user = us.findByEmailorUsername(form.get().getName());
        if(user==null){

            return notFound();
        }
        if(!us.checkPassword(user, form.get().getPassword())){
            return badRequest();
        }

        UserViewModel u = new UserViewModel(user);
        return ok(Json.toJson(u));

    }
}
