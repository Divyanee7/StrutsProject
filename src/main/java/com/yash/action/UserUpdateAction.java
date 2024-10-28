package com.yash.action;


import com.yash.dao.UserDAO;
import com.yash.form.UserForm;
import com.yash.model.User;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserUpdateAction extends Action {
    private final UserDAO userDao = new UserDAO();

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        try {
            UserForm userForm = (UserForm) form;
            User user = new User();
            user.setId(userForm.getId());
            user.setName(userForm.getName());
            user.setEmail(userForm.getEmail());
            userDao.updateUser(user);
            return mapping.findForward("success");
        } catch (Exception e) {
            e.printStackTrace();
            return mapping.findForward("error");
        }
    }
}
