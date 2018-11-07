//package com.yuehai.demo.config;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * Created by zhaoyuehai 2018/10/15
// */
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    //身份验证管理生成器
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
//    }
//
//    //HTTP请求安全处理
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll();
//    }
//
//    //WEB安全
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
//    }
//}
