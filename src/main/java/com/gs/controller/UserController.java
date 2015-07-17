package com.gs.controller;

import com.gs.bean.User;
import com.gs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by WangGenshen on 7/17/15.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("index/{id}")
    public ModelAndView findUserById(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("index");
        User user = userService.findUserById(id);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("index")
    public String findUsers(Model model) {
        List<User> users = userService.findUsers();
        for (User user : users) {
            System.out.println(user);
        }
        model.addAttribute("users", users);
        return "index";
    }

}
