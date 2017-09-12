package com.memcached.config;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lf on 2016/12/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DatasourceConfigTest {

    @Autowired
    private DatasourceConfig config;

    @Test
    public void test1(){
        System.out.println(config);
    }
}