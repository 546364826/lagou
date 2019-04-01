package com.zwj.dao;

import com.zwj.entity.Users;

import java.util.List;

public interface UsersDao {
    boolean addUsers(Users user);

    boolean deleteUsers(String email);

    boolean updateUsers(Users user, String email);

    Users queryUsers(String email);

    List<Users> queryAllUsers();

    boolean queryUser(String email, String password);

    boolean isExist(String email);

}
