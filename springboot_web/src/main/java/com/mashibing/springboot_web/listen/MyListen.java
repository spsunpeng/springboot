package com.mashibing.springboot_web.listen;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.sound.midi.Soundbank;

/**
 * @author sunpeng
 * @Date 2021-02-25 17:24
 */
public class MyListen implements HttpSessionListener {

    public static int online=0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        online++;
        System.out.println("创建+1");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("销毁-1");
    }
}
