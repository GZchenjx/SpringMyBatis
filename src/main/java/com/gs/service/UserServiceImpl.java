package com.gs.service;

import com.gs.bean.User;
import com.gs.common.bean.Pager;
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
    public List<User> query() {
        return userDAO.query();
    }

    @Override
    public User queryById(int id) {
        return userDAO.queryById(id);
    }

    @Override
    public int insert(User user) {
        return userDAO.insert(user);
    }

    @Override
    public int batchInsert(List<User> users) {
        return userDAO.batchInsert(users);
    }

    @Override
    public List<User> queryByPager(Pager pager) {
        return userDAO.queryByPager(pager);
    }

    @Override
    public int count() {
        return userDAO.count();
    }
}
