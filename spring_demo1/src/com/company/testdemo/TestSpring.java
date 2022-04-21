package com.company.testdemo;

import com.company.dao.Book;
import com.company.dao.Orders;
import com.company.dao.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testAdd(){
        //1.加载Spring配置对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = applicationContext.getBean("user", User.class);
        //3.测试
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook1(){
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = applicationContext.getBean("book",Book.class);
        //3.测试
        book.print();
    }
    @Test
    public void testOrders(){
        //1.加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Orders orders = applicationContext.getBean("orders",Orders.class);
        //3.测试
        orders.print();
    }
}
