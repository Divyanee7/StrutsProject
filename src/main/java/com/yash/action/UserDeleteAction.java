package com.yash.action;

import com.yash.dao.UserDAO;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserDeleteAction extends Action {
    private final UserDAO userDao = new UserDAO();

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            userDao.deleteUser(id);
            return mapping.findForward("success");
        } catch (Exception e) {
            e.printStackTrace();
            return mapping.findForward("error");
        }
    }
}