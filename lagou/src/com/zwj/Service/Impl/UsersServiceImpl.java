package com.zwj.Service.Impl;

import com.zwj.Service.UsersService;
import com.zwj.dao.Impl.UsersDaoImpl;
import com.zwj.entity.Users;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    UsersDaoImpl userDao = new UsersDaoImpl() ;
    public boolean addUsers(Users user) {
        if (userDao.isExist(user.getEmail())) {
            System.out.println("此人已经存在，不能重复添加");
            return false;
        }
        return userDao.addUsers(user);
    }


    public boolean deleteUsers(String email) {
        if (!userDao.isExist(email)) {
            System.out.println("查无此人");
            return false;
        }
        return userDao.deleteUsers(email);
    }


    public boolean updateUsers(Users user, String email) {
        if (!userDao.isExist(email)) {
            System.out.println("查无此人");
            return false;
        }
        return userDao.updateUsers(user,email);
    }


    public boolean queryUser(String email,String password) {
        return userDao.queryUser(email,password);
    }

    public Users queryUsers(String email) {
        return userDao.queryUsers(email);
    }


    public List<Users> queryAllUsers() {
        return userDao.queryAllUsers();
    }


    public boolean isExist(String email) {
        return userDao.isExist(email);
    }
}

