package com.zwj.servlet;


import com.zwj.Service.Impl.LablesServiceImpl;
import com.zwj.Service.Impl.PresonServiceImpl;
import com.zwj.entity.Lables;
import com.zwj.entity.Preson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddLablesServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String lable = request.getParameter("lable");
        Lables lables = new Lables(lable);
        LablesServiceImpl LablesService = new LablesServiceImpl();
        boolean result = LablesService.addLables(lables);
        if (result == true) {
            response.sendRedirect("company3.jsp");
        } else {
            response.sendRedirect("company2.jsp");
        }
    }
}
