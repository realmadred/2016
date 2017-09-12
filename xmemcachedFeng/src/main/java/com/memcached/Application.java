package com.memcached;

import com.memcached.config.JdbcProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by lf on 2016/11/15.
 */
@SpringBootApplication
@EnableConfigurationProperties(JdbcProperties.class)
//@ImportResource(locations = {"classpath:applicationContext.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
