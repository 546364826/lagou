package com.zwj.servlet;

import com.zwj.Service.Impl.UsersServiceImpl;
import com.zwj.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class QueryAllUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        UsersServiceImpl usersSrevice = new UsersServiceImpl();
        List<Users> users = usersSrevice.queryAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("").forward(request, response);
    }
}
