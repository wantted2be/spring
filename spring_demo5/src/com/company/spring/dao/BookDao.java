package com.company.spring.dao;

import com.company.spring.entity.Book;

import java.util.List;

public interface BookDao {
    //添加的方法
    void add(Book book);
    //修改的方法
    void modify(Book book);

    void delete(Book book);

    int selectCount();

    Book selectOne(String id);

    List<Book> selectMany();

    void batchAddBook(List<Object[]> batchArgs);

    void batchModifyBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
