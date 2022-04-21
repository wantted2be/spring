package com.company.spring.test;

import com.company.spring.entity.Book;
import com.company.spring.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {
    @Test
    public void testBookAdd(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("001");
        book.setUsername("张三");
        book.setStatus("h");
        bookService.addBook(book);
    }
    @Test
    public void testBookModify(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("002");
        book.setUsername("李四");
        book.setStatus("hh");
        bookService.modifyBook(book);
    }
    @Test
    public void testBookDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("001");
        book.setUsername("张三");
        book.setStatus("h");
        bookService.deleteBook(book);
    }
    @Test
    public void testBookCount(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        System.out.println(bookService.findCount());
    }
    @Test
    public void testBookOne(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        Book book = bookService.findBookInfo("1");
        System.out.println(book);
    }
    @Test
    public void testBookMany(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        List<Book> book = bookService.findBookMany();
        System.out.println(book);
    }
    //批量添加测试
    @Test
    public void testBookBatchAdd(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        //准备数据
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o3 = {"3","王五","hhh"};
        Object[] o4 = {"4","赵六","hhhh"};
        Object[] o5 = {"5","无名氏","hhhhh"};
        batchArgs.add(o3);
        batchArgs.add(o4);
        batchArgs.add(o5);
        bookService.batchAdd(batchArgs);
    }
    //批量修改测试
    @Test
    public void testBookBatchModify(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        //准备数据
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o3 = {"王五","aaa","3"};
        Object[] o4 = {"赵六","aaaa","4"};
        Object[] o5 = {"无名氏","aaaaa","5"};
        batchArgs.add(o3);
        batchArgs.add(o4);
        batchArgs.add(o5);
        bookService.batchModify(batchArgs);
    }
    //批量删除测试
    @Test
    public void testBookBatchDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        //准备数据
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o3 = {"3","王五","aaa"};
        Object[] o4 = {"4","赵六","aaaa"};
        batchArgs.add(o3);
        batchArgs.add(o4);
        bookService.batchDelete(batchArgs);
    }

}
