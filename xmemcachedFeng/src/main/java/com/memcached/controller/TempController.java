package com.memcached.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lf on 2016/12/2.
 */
@RestController
@RequestMapping("/temp")
public class TempController {

    @Autowired
    private JdbcTemplate template;

    @RequestMapping("/user")
    public Map<String,Object> test1(){
        Map<String,Object> result = new HashMap<>();
        String sql = "select * from user";

        System.out.println(template);
        final List<Map<String, Object>> maps = template.queryForList(sql);
        result.put("sql",sql);
        result.put("maps",maps);
        return result;
    }

    @RequestMapping("/upUser")
    public Map<String,Object> upUser(){
        Map<String,Object> result = new HashMap<>();
        String sql = "UPDATE user SET name = 'ssstssss' WHERE id = ?";
        final int update = template.update(sql, new Object[]{5});
        result.put("sql",sql);
        result.put("update",update);
        return result;
    }

    @RequestMapping("/del")
    public Map<String,Object> del(){
        Map<String,Object> result = new HashMap<>();
        String sql = "DELETE FROM user WHERE id = ?";
        final int update = template.update(sql, new Object[]{6});
        result.put("sql",sql);
        result.put("update",update);
        return result;
    }

}
