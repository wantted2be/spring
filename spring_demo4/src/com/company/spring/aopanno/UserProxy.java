package com.company.spring.aopanno;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void pointdemo() {

    }
    //前置通知
     //@Before注解表示作为前置通知
     @Before(value = "pointdemo()")
     public void before1() {
        System.out.println("before.........");
     }
    //前置通知
    @Before(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void before(){
        System.out.println("before...");
    }
    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning.........");
    }
    //最终通知
    @After(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void after() {
        System.out.println("after.........");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void afterThrowing() {
        System.out.println("afterThrowing.........");
    }
    //环绕通知
    @Around(value = "execution(* com.company.spring.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }
}
