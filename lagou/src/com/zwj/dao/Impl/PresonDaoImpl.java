package com.zwj.dao.Impl;

import com.zwj.dao.PresonDao;
import com.zwj.entity.Preson;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PresonDaoImpl implements PresonDao {
    @Override
    public boolean addPreson(Preson preson) {
        String sql = "insert into preson(loginemail,name,sex,degree,hands,phone,email,idea,headpic) values (?,?,?,?,?,?,?,?,?)";
        Object[] os = {preson.getLoginemail(),preson.getName(), preson.getSex(), preson.getDegree(),preson.getHands(),preson.getPhone(),preson.getEmail(),preson.getIdea(),preson.getHeadpic()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean deletePreson(String loginemail) {
        String sql = "delete from preson where loginemail =?";
        Object[] os = {loginemail};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean updatePreson(Preson preson, String loginemail) {
        String sql = "update preson set loginemail=?,name=?,sex=?,degree=?,hands=?,phone=?,email=?,idea=?,headpic=? where loginemail=?";
        Object[] os = {preson.getLoginemail(),preson.getName(), preson.getSex(), preson.getDegree(),preson.getHands(),preson.getPhone(),preson.getEmail(),preson.getIdea(),preson.getHeadpic(),loginemail};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public Preson queryPreson(String loginemail) {
        String sql = "select loginemail,name,sex,degree,hands,phone,email,idea,headpic from preson where loginemail=?";
        Object[] os = {loginemail};
        Preson preson = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String loginemail1 = rs.getString("loginemail");
                String names = rs.getString("name");
                String sex = rs.getString("sex");
                String degree = rs.getString("degree");
                String hands = rs.getString("hands");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String idea = rs.getString("idea");
                String headpic = rs.getString("headpic");

                preson = new Preson(loginemail1,names, sex, degree, hands, phone,email ,idea,headpic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preson;
    }

    @Override
    public List<Preson> queryAllPreson() {
        String sql = "select name,sex,degree,hands,phone,work from preson";
        Object[] os = null;
        List<Preson> PresonList = new ArrayList<Preson>();
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            while (rs.next()) {
                String loginemail1 = rs.getString("loginemail");
                String names = rs.getString("name");
                String sex = rs.getString("sex");
                String degree = rs.getString("degree");
                String hands = rs.getString("hands");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String idea = rs.getString("idea");
                String headpic = rs.getString("headpic");
                Preson preson = new Preson(loginemail1,names, sex, degree, hands, phone,email ,idea,headpic);
                PresonList.add(preson);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PresonList;
    }

    @Override
    public boolean isExist(String loginemail1) {
        boolean isExist = false;
        Preson preson = queryPreson(loginemail1);
        isExist = (preson == null) ? false : true;
        return isExist;
    }
}
