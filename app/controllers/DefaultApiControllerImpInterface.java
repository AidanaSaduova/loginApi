package controllers;

import apimodels.UserLoginApiForm;
import apimodels.UserViewModel;

@SuppressWarnings("RedundantThrows")
public interface DefaultApiControllerImpInterface {
    UserViewModel login(UserLoginApiForm user) throws Exception;

}
