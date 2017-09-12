//package com.memcached.controller;
//
//import net.rubyeye.xmemcached.MemcachedClient;
//import net.rubyeye.xmemcached.exception.MemcachedException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.TimeoutException;
//
///**
// * Created by lf on 2016/11/16.
// */
//@RestController
//@RequestMapping("/memcache")
//public class MemcachedController {
//
//    @Autowired
//    private MemcachedClient client;
//
//    @Autowired
//    private Environment env;
//
//
//    @RequestMapping("/test")
//    public String test(){
//        try {
//            String feng = "feng";
//            client.set(feng, 15, "liufeng");
//            client.add(feng,15,"sanshui");
//            client.append(feng,"append");
//            client.prepend(feng,"890");
//            client.replace(feng,20,"replase");
////            client.delete(feng);
////            client.getAndTouch(feng,10);
//            return client.get(feng);
//        } catch (TimeoutException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (MemcachedException e) {
//            e.printStackTrace();
//        }
//        return "error";
//    }
//
//    @RequestMapping("/one")
//    public Integer getOne(){
//        return (int) ((Runtime.getRuntime().maxMemory() / 1024.0 / 1024.0));
//    }
//
//    @RequestMapping("/t")
//    public Integer getTwo(){
//        System.out.println(env);
//        System.out.println(env.getActiveProfiles());
//        System.out.println(env.getProperty("memcached.port"));
//        return (int) ((Runtime.getRuntime().freeMemory() / 1024.0 / 1024.0));
//    }
//
//    @RequestMapping("/to")
//    public Integer getTotal(){
//        return (int) ((Runtime.getRuntime().totalMemory() / 1024.0 / 1024.0));
//    }
//}
