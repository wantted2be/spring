package com.company.spring.test;

import com.company.spring.aopanno.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testAop(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user",User.class);
        user.add();
    }
}
