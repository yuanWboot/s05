package com.zy.spring.ioc;

import com.zy.spring.ioc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);

    }
}
