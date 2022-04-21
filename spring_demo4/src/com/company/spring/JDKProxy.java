package com.company.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
//        //创建接口实现类的代理对象
//        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        })

        //创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userDao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces,new UserDaoProxy(userDaoImpl));
        int result = userDao.add(1,2);
        System.out.println(result);
    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    //1.创建谁的代理对象，就要传递谁
    //有参数构造函数
    private Object object;
    public UserDaoProxy(Object object){
        this.object = object;
    }

    //增强的逻辑在这个地方写
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前做个处理
        System.out.println("方法之前执行..." + method.getName() + ":传递参数" + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(object,args);

        //方法之后
        System.out.println("方法执行之后" + object);
        return res;
    }
}
