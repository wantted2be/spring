package com.company.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.company.spring"})  //开启组件扫描
public class SpringConfig {
}
