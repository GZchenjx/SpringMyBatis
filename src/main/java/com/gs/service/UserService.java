package com.gs.service;

import com.gs.bean.User;

import java.util.List;

/**
 * Created by WangGenshen on 7/16/15.
 */
public interface UserService {

    public List<User> findUsers();
    public User findUserById(int id);

}
