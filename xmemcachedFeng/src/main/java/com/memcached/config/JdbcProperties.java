package com.memcached.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lf on 2016/12/2.
 */
@ConfigurationProperties(prefix = "db")
public class JdbcProperties {

    private String url;
    private String username;
    private String password;
    private Integer maxActive;
    private Integer initialSize;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(Integer maxActive) {
        this.maxActive = maxActive;
    }

    public Integer getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(Integer initialSize) {
        this.initialSize = initialSize;
    }

}
