package com.gs.controller;

import com.gs.bean.User;
import com.gs.common.bean.Pager;
import com.gs.common.util.PagerUtil;
import com.gs.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public ModelAndView queryById(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("index");
        User user = userService.queryById(id);
        mav.addObject("user", user);
        return mav;
    }

    @RequestMapping("index")
    public String query(Model model) {
        List<User> users = userService.query();
        for (User user : users) {
            System.out.println(user);
        }
        model.addAttribute("users", users);
        return "index";
    }

    @RequestMapping("add")
    public String insert() {
        User user = new User();
        user.setName("WGS");
        user.setPassword("abc");
        int count = userService.insert(user);
        int id = user.getId();
        System.out.println("Count: " + count + ", id: " + id);
        return "redirect:/index";
    }

    @RequestMapping("batchAdd")
    public String batchInsert() {
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setName("123");
        user.setPassword("123");
        users.add(user);
        User user1 = new User();
        user1.setName("234");
        user1.setPassword("234");
        users.add(user1);
        int result = userService.batchInsert(users);
        for(int i = 0; i < result; i++) {
            System.out.println("Count: " + result + ", id: " + users.get(i).getId());
        }
        return "redirect:/index";
    }

    @RequestMapping("page/{pageNo}")
    public String queryByPager(@PathVariable("pageNo") int pageNo) {
        int count = userService.count();
        Pager pager = PagerUtil.getPager(pageNo);
        PagerUtil.rebuildPager(pager, count);
        System.out.println("Total records: " + pager.getTotalRecords() + ", total pages: " + pager.getTotalPages());
        List<User> users = userService.queryByPager(pager);
        for(User user : users) {
            System.out.println(user);
        }
        return "redirect:/index";
    }

}
