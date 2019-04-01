package com.zwj.servlet;


import com.zwj.Service.Impl.IntroduceServiceImpl;
import com.zwj.entity.Introduce;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddIntroduceServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String culture = request.getParameter("culture");
        Introduce introduce = new Introduce(culture);
        IntroduceServiceImpl IntroduceService = new IntroduceServiceImpl();
        boolean result = IntroduceService.AddIntroduce(introduce);
        if (result == true) {
            response.sendRedirect("company6.jsp");
        } else {
            response.sendRedirect("company5.jsp");
        }
    }
}
