package com.example;

import com.example.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
@EnableZuulProxy
public class ZuulCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulCloudApplication.class, args);
	}

	@Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
