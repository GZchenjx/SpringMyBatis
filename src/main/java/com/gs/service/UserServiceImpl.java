package com.gs.service;

import com.gs.bean.User;
import com.gs.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WangGenshen on 7/16/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public List<User> findUsers() {
        return userDAO.findUsers();
    }

    @Override
    public User findUserById(int id) {
        return userDAO.findUserById(id);
    }
}
