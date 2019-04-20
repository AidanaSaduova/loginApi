package controllers;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    UserViewModel login(UserLoginApiForm user) throws Exception;

}
