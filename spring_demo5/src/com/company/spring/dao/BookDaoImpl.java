package com.company.spring.dao;

import com.company.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao{

    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1.定义sql
        String sql = "insert into t_user values(?,?,?)";
        //2.调用方法实现
        Object[] args = {book.getUserId(),book.getUsername(),book.getStatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void modify(Book book) {
        //1.定义sql
        String sql = "update t_user set username=?,status=? where user_id=?";
        //2.调用方法实现
        Object[] args = {book.getUsername(),book.getStatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(Book book) {
        //1.定义sql
        String sql = "delete from t_user where user_id=? and username=? and status=?";
        //2.调用方法实现
        int update = jdbcTemplate.update(sql,book.getUserId(),book.getUsername(),book.getStatus());
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_user";
        int count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    //查询返回book对象
    @Override
    public Book selectOne(String id) {
        String sql = "select * from t_user where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> selectMany() {
        String sql = "select * from t_user";
        List<Book> book = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return book;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchModifyBook(List<Object[]> batchArgs) {
        String sql = "update t_user set username=?,status=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_user where user_id=? and username=? and status=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
