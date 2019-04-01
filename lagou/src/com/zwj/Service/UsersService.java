package com.zwj.Service;

import com.zwj.entity.Users;

import java.util.List;


public interface UsersService {
    boolean addUsers(Users user);

    boolean deleteUsers(String email);

    boolean updateUsers(Users user, String email);

    boolean queryUser(String email, String password);

    Users queryUsers(String email);

    List<Users> queryAllUsers();

    boolean isExist(String email);
}


