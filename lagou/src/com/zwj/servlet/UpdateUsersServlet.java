package com.zwj.servlet;


import com.zwj.Service.Impl.UsersServiceImpl;
import com.zwj.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String newpassword = request.getParameter("newpassword");
        Users users = new Users(null, email, newpassword);
        UsersServiceImpl usersSrevice = new UsersServiceImpl();
        System.out.println(email);
        System.out.println(newpassword);
        boolean result = usersSrevice.updateUsers(users, email);
        if (!result) {
            request.setAttribute("updateError", "error");
            request.getRequestDispatcher("updatePwd.jsp").forward(request, response);
        } else {
            request.setAttribute("updateSuccess", "success");
            response.sendRedirect("login.jsp");
        }
    }
}
