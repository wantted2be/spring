package com.company.spring.Bean;

public class Orders {
    private String oname;

    public Orders() {
        System.out.println("第一步，执行无参数构造函数");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性的值");
    }
    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("第三步，调用bean的初始化的方法");
    }
    //创建执行销毁的方法
    public void destroyMethod(){
        System.out.println("第五步，执行bean的销毁的方法");
    }
}
