package com.udr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by udr013 on 13-5-2016.
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    // bean to access database over spring security
    @Bean(name="driverManagerDataSource")
    public DriverManagerDataSource driverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false");
//        driverManagerDataSource.setUsername("root");
//        driverManagerDataSource.setPassword("style-73");


//        driverManagerDataSource.setDriverClassName("org.h2.Driver");
//        driverManagerDataSource.setUrl("jdbc:h2:~/test2");
//        driverManagerDataSource.setUsername("sa");
//        driverManagerDataSource.setPassword("");

        driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
        driverManagerDataSource.setUrl("jdbc:h2:ec2-54-83-44-229.compute-1.amazonaws.com/dcjvcrnkm4bj5n");
        driverManagerDataSource.setUsername("vieipbvzpwytjl");
        driverManagerDataSource.setPassword("Xs2D0Tim02pa7xk0j14z4CdNty");

        return driverManagerDataSource;
    }
}
