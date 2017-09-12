package com.feng.mongo.controller;

import com.feng.mongo.entity.User;
import com.feng.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lf on 2016/11/8.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public List<User> test(){
        return userService.queryAll();
    }

    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("8888888");
        user.setPhone("189999999977");
        user.setAge(23);
        userService.add(user);
        return "success";
    }

}
