package com.mashibing.springboot_web.config;

import com.mashibing.springboot_web.listen.MyListen;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunpeng
 * @Date 2021-02-25 17:27
 */
@Configuration
public class ListenConfig {

    @Bean
    public ServletListenerRegistrationBean listenerRegist(){
        ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
        srb.setListener(new MyListen());
        System.out.println("listener");
        return srb;
    }
}
