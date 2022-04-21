package com.company.spring.service;

import com.company.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1,readOnly = true)
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;
    //转账的方法
    public void accountMoney(){
        userDao.reduceMoney();  //lucy少100
        userDao.addMoney();  //Mary多100
    }
}
