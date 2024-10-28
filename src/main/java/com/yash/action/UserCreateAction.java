package com.yash.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.form.UserForm;
import com.yash.dao.UserDAO;
import com.yash.model.User;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.sql.SQLException;

public class UserCreateAction extends Action {
    private final UserDAO userDao = new UserDAO();

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws SQLException {
        UserForm userForm = (UserForm) form;
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        userDao.createUser(user);

        return mapping.findForward("success");
    }
}