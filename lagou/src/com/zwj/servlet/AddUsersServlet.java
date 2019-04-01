package com.zwj.servlet;


import com.zwj.Service.Impl.UsersServiceImpl;
import com.zwj.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String purpose = request.getParameter("purpose");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Users user = new Users(purpose, email, password);
        UsersServiceImpl usersSrevice = new UsersServiceImpl();
        boolean result = usersSrevice.addUsers(user);
        if (!result) {
            request.setAttribute("addError", "error");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
    }
}
