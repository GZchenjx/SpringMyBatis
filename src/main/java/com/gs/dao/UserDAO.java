package com.gs.dao;

import com.gs.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WangGenshen on 7/16/15.
 */
@Repository
public interface UserDAO {

    public List<User> findUsers();
    public User findUserById(int id);

}
