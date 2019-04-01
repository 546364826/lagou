package com.zwj.servlet;

import com.zwj.Service.Impl.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class QueryUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String email = request.getParameter("email");
        String password= request.getParameter("password");
        UsersServiceImpl usersSrevice = new UsersServiceImpl();
        //判断用户是否注册
        boolean result = usersSrevice.queryUser(email,password);


        if (result) {
            //个人
            if (usersSrevice.queryUsers(email).getPurpose().equals("0")) {
                HttpSession session = request.getSession(false);
                //判断是否是第一次登陆
                if (session.getAttribute("email") == null || session.getAttribute("email") != email) {
                    session.setAttribute("email", email);
                    request.setAttribute("selectError", "error");
                    response.sendRedirect("resume.jsp");
                } else {
                    response.sendRedirect("indexlogin.jsp");
                }
            } else
            if (usersSrevice.queryUsers(email).getPurpose().equals("1")){
                HttpSession session = request.getSession(false);
                //公司
                if (session.getAttribute("email") == null || session.getAttribute("email") != email) {

                    session = request.getSession();
                    session.setAttribute("email", email);
                    response.sendRedirect("company1.jsp");
                } else {
                    response.sendRedirect("indexlogin.jsp");
                }
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}