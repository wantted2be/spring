package com.company.spring.service;

import com.company.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//在注解里面value值可以省不写，默认值是首字母小写的类名称
@Service(value = "userService")  //<bean id="userService" class="com.com..."></bean>
public class UserService {

    //定义dao类型的属性,不需要添加setter方法
    @Autowired
    @Qualifier(value = "userDaoImpl")  // value值是实现类根据名称进行对象创建的实例
    private UserDao userDao;

    public void add(){
        System.out.println("service add....");
        userDao.add();
    }
}
