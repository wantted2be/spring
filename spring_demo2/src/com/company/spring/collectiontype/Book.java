package com.company.spring.collectiontype;

import java.util.List;

public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void print() {
        System.out.println(list);
    }
}
