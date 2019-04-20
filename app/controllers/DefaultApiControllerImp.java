package controllers;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-04-20T20:49:34.098+02:00")

public class DefaultApiControllerImp implements DefaultApiControllerImpInterface {
    @Override
    public UserViewModel login(UserLoginApiForm user) throws Exception {
        //Do your magic!!!
        return new UserViewModel();
    }

}
