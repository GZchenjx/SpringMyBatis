package com.gs.service;

import com.gs.bean.User;
import com.gs.common.bean.Pager;

import java.util.List;

/**
 * Created by WangGenshen on 7/16/15.
 */
public interface UserService {

    public List<User> query();
    public User queryById(int id);
    public int insert(User user);
    public int batchInsert(List<User> users);
    public List<User> queryByPager(Pager pager);
    public int count();

}
