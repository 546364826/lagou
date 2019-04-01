package com.zwj.dao.Impl;

import com.zwj.dao.UsersDao;
import com.zwj.entity.Users;
import com.zwj.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class UsersDaoImpl implements UsersDao{
    @Override
    public boolean addUsers(Users user) {
        String sql = "insert into users(purpose,email,password) values (?,?,?)";
        Object[] os = {user.getPurpose(), user.getEmail(), user.getPassword()};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean deleteUsers(String email) {
        String sql = "delete from users where email =?";
        Object[] os = {email};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean updateUsers(Users user, String email) {
        String sql = "update users set email=?,password=? where email=?";
        Object[] os = {user.getEmail(),user.getPassword(),email};
        return DBUtil.executeAddOrUodateOrDelete(sql, os);
    }

    @Override
    public boolean queryUser(String email,String password) {
        String sql = "select purpose,email,password from users where email=? and password=?";
        Object[] os = {email,password};
        boolean falg = true;
        try {
            ResultSet rss = DBUtil.executeQuery(sql, os);
            if (rss == null) {
                falg = false;
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return falg;
    }

    @Override
    public Users queryUsers(String email) {
        String sql = "select purpose,email,password from users where email=?";
        Object[] os = {email};
        Users user = null;
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            if (rs.next()) {
                String purpose1 = rs.getString("purpose");
                String email1 = rs.getString("email");
                String password1 = rs.getString("password");
                user = new Users(purpose1, email1, password1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<Users> queryAllUsers() {
        String sql = "select purpose,email,password from users";
        Object[] os = null;
        List<Users> usersList = new ArrayList<Users>();
        try {
            ResultSet rs = DBUtil.executeQuery(sql, os);
            while (rs.next()) {
                String purpose2 = rs.getString("purpose");
                String email2 = rs.getString("email");
                String password2 = rs.getString("password");
                Users user = new Users(purpose2, email2, password2);
                usersList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersList;
    }

    //根据邮箱判断一个人是否已经存在
    @Override
    public boolean isExist(String email) {
        boolean isExist = false;
        Users user = queryUsers(email);
        isExist = (user == null) ? false : true;
        return isExist;
    }

}
