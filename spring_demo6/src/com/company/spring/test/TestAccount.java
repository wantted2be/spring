package com.company.spring.test;

import com.company.spring.config.TxConfig;
import com.company.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
    @Test
    public void testTrans(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.accountMoney();
    }
    @Test
    public void testTransConfig(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.accountMoney();
    }
}
