package com.company.dao;

public class Orders {
    //定义属性
    private String oname;
    private String address;

    //有参数的构造函数
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void print(){
        System.out.println(this.oname + ' ' + this.address);
    }
}
