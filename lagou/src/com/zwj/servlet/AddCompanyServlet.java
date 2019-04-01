package com.zwj.servlet;

import com.zwj.Service.Impl.CompanyServiceImpl;
import com.zwj.entity.Company;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCompanyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       this.doPost(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String fullname = request.getParameter("fullname");
        String names = request.getParameter("name");
        String website = request.getParameter("website");
        String chinacity = request.getParameter("chinacity");
        String Industry = request.getParameter("Industry");
        String csize = request.getParameter("csize");
        String phase = request.getParameter("phase");
        String temptation = request.getParameter("temptation");
        Company company = new Company(fullname, names, website, chinacity, Industry, csize, phase, temptation);
        CompanyServiceImpl companyService = new CompanyServiceImpl();
        boolean result = companyService.addCompany(company);
        if (result) {
            response.sendRedirect("company2.jsp");
        } else {
            response.sendRedirect("company1.jsp");
        }
    }
}
