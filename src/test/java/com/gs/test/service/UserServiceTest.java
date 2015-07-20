package com.gs.test.service;

import com.gs.bean.User;
import com.gs.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by WangGenshen on 7/16/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:web/WEB-INF/config/spring-*.xml")
public class UserServiceTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private UserService userService;

    @Test
    public void queryById(){
        User user = new User();
        System.out.println(userService.queryById(1));
    }
}
