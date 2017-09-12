package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feng on 2017/1/30.
 */
@RestController
public class ServiceAController {

    @RequestMapping("/test")
    public String testA(){
        return "aaa";
    }
}
