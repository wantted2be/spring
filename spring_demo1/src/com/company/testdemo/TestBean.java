package com.company.testdemo;

import com.company.bean.Emp;
import com.company.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = applicationContext.getBean("userService",UserService.class);
        //3.测试
        userService.add();
    }
    @Test
    public void testBean2(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = applicationContext.getBean("emp",Emp.class);
        //3.测试
        System.out.println(emp.toString());
    }
}
