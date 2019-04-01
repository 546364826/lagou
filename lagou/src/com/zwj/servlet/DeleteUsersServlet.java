package com.zwj.servlet;

import com.zwj.Service.Impl.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static java.lang.System.out;

public class DeleteUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        UsersServiceImpl usersSrevice = new UsersServiceImpl();
        boolean result = usersSrevice.deleteUsers(email);
        if (!result) {
            request.setAttribute("delError", "Error");
        }
        if (request.getAttribute("addError") != null) {
            out.print("<strong>增加失败</strong>");
        } else {
            request.getRequestDispatcher("").forward(request, response);
        }

    }
}
