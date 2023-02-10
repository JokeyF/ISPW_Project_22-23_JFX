package com.cappellinispirito.ispw_project_202223_jfx.Controller;

import com.cappellinispirito.ispw_project_202223_jfx.Model.beansInterface.RegistrationBean;
import com.cappellinispirito.ispw_project_202223_jfx.Model.dao.UserAccountDAO;

public class RegistrationController {

    public void register(RegistrationBean bean) throws Exception {
        String registerUsername = bean.getUsername();
        String registerPassword = bean.getPassword();
        UserAccountDAO accountDAO = new UserAccountDAO();
        accountDAO.checkIfUserExists(registerUsername);
        accountDAO.createAccount(registerUsername, registerPassword);
        bean.setIsRegistrationDone(true);
    }
}
