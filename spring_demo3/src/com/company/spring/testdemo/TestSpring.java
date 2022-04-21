package com.company.spring.testdemo;

import com.company.spring.config.SpringConfig;
import com.company.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.add();
    }
    @Test
    public void testService2(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.add();
    }
}
