package com.memcached.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by lf on 2016/12/2.
 */
@Configuration
public class DatasourceConfig {

    @Autowired
    private JdbcProperties config;

    @Primary
    @Bean(name = "diuidDataSource")
    public DataSource getDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setMaxActive(config.getMaxActive());
        dataSource.setUsername(config.getUsername());
        dataSource.setPassword(config.getPassword());
        dataSource.setUrl(config.getUrl());
        dataSource.setInitialSize(config.getInitialSize());
        return dataSource;
    }

    @Bean
    public JdbcTemplate getTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }
}
