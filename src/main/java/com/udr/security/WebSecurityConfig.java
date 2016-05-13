package com.udr.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by udr013 on 12-5-2016.
 */

//this is all spring security: WebSecurityConfigurerAdapter, configureGlobal, AuthenticationManagerBuilder. That's just how it is
@Configuration
@EnableWebSecurity //this secures the web environment

//extending this class just gives us a lot of reasonable default settings
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/fonts/**", "/images/**","/","/about","/contact","/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login")//because we override and create our own login page we need to give permission
                // to access this login page by adding the permitAll()as good practise so unauthenticated users can access it for sure!!
                .permitAll()
                .defaultSuccessUrl("/completeCollection")
                .and()
                .logout().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("user")
                .password("password")
                .roles("USER")//and()..withUser("admin").password("password").roles("ADMIN")
        ;

    }
}