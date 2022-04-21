package com.company.spring.factorybean;

import com.company.spring.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {
    //定义返回的Bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("Java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
