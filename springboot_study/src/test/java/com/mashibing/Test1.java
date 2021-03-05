package com.mashibing;

import com.mashibing.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sunpeng
 * @Date 2021-02-24 17:37
 */
@SpringBootTest
public class Test1 {

    @Autowired
    Person person;

    @Test
    public void test1(){
        System.out.println(person);
    }
}
