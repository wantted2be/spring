package com.company.dao;

public class Book {

    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    //创建属性对应的setter方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println(this.bname + ':' + this.bauthor + ':' + this.address);
    }
}
