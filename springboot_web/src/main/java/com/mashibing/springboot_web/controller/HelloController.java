package com.mashibing.springboot_web.controller;

import com.mashibing.springboot_web.listen.MyListen;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author sunpeng
 * @Date 2021-02-25 11:15
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        return "hello";
    }

    @RequestMapping("/online")
    public String getOnline(){
        return "在线人数："+ MyListen.online;
    }
}
