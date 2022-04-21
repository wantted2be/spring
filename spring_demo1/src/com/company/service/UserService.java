package com.company.service;

import com.company.dao.UserDao;

public class UserService {

    //创建UserDAO属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add ...");
        userDao.update();
    }
}
