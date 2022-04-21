package com.company.spring.testdemo;

import com.company.spring.Bean.Orders;
import com.company.spring.autowire.Emp;
import com.company.spring.collectiontype.Book;
import com.company.spring.collectiontype.Course;
import com.company.spring.collectiontype.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testCollection(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Stu stu = applicationContext.getBean("stu",Stu.class);
        //3.测试
        stu.print();
    }
    @Test
    public void testCollection2(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        Book book = applicationContext.getBean("book",Book.class);
        Book book2 = applicationContext.getBean("book",Book.class);
        //3.测试
//        book.print();
        System.out.println(book);
        System.out.println(book2);
    }
    @Test
    public void testMyBean(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Course course = applicationContext.getBean("myBean",Course.class);
        //3.测试
        System.out.println(course.toString());
    }
    @Test
    public void testBean1(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");
        //2.获取配置创建的对象
        Orders orders = applicationContext.getBean("orders", Orders.class);
        //3.测试
        System.out.println("第四步，获取bean对象");
        System.out.println(orders);
        //4.销毁对象
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
    @Test
    public void testAutowire(){
        //1.加载配置创建的对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        //2.获取配置创建的对象
        Emp emp = applicationContext.getBean("emp", Emp.class);
        //3.测试
        System.out.println(emp);
    }
}
