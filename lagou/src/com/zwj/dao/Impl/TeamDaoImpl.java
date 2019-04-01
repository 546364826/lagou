package com.zwj.dao.Impl;

import com.zwj.dao.TeamDao;
import com.zwj.entity.Team;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamDaoImpl  implements TeamDao {
    @Override
    public boolean AddTeam(Team team) {
        String sql = "insert into team(founder,position,weibo,Introduction) values (?,?,?,?)";
        Object[] os = {team.getFounder(),team.getPosition(),team.getWeibo(),team.getIntroduction()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Team queryTeam(String founders) {
        String sql = "select founder,position,weibo,Introduction from team where founder=?";
        Object[] os = {founders};
        Team team = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String founder = rs.getString("founder");
                String position = rs.getString("position");
                String weibo = rs.getString("weibo");
                String Introduction = rs.getString("Introduction");

                team = new Team(founder,position, weibo, Introduction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return team;
    }
}
