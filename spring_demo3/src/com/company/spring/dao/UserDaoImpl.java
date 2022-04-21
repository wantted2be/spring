package com.company.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
