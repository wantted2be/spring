package com.company.spring.service;

import com.company.spring.dao.BookDao;
import com.company.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改的方法
    public void modifyBook(Book book){
        bookDao.modify(book);
    }

    //删除的方法
    public void deleteBook(Book book){
        bookDao.delete(book);
    }

    //查询表中的记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //根据id返回查询对象
    public Book findBookInfo(String id){
        return bookDao.selectOne(id);
    }

    //查询返回对象集合
    public List<Book> findBookMany(){
        return bookDao.selectMany();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchModify(List<Object[]> batchArgs){
        bookDao.batchModifyBook(batchArgs);
    }
    //批量修改
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
