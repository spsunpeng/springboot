package com.mashibing.springboot_web;

import com.mashibing.springboot_web.servlet.HelloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
@ServletComponentScan
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }

/*    @Bean
    public ServletRegistrationBean<HelloServlet> getServletRegistrationBean(){
        ServletRegistrationBean<HelloServlet> bean = new ServletRegistrationBean<>(new HelloServlet());
        ArrayList<String> url = new ArrayList<>();
        url.add("/helloServlet");
        bean.setUrlMappings(url);
        bean.setLoadOnStartup(1);
        return bean;
    }*/


}
