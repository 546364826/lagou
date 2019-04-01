package com.zwj.servlet;

import com.zwj.Service.Impl.TeamServiceImpl;
import com.zwj.entity.Team;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddTeamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String founder = request.getParameter("founder");
        String position = request.getParameter("position");
        String weibo = request.getParameter("weibo");
        String Introduction = request.getParameter("Introduction");
        Team team = new Team(founder, position, weibo, Introduction);
        TeamServiceImpl teamService = new TeamServiceImpl();
        boolean result = teamService.AddTeam(team);
        if (result == true) {
            response.sendRedirect("company4.jsp");
        } else {
            response.sendRedirect("company3.jsp");
        }
    }
}
