package com.feng.mongo.service;

import com.feng.mongo.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lf on 2016/11/8.
 */
@Service
public class UserService {

    @Resource
    private MongoTemplate template;

    public List<User> queryAll(){
        return template.findAll(User.class);
    }

    public void add(User user){
        template.insert(user);
    }

}
