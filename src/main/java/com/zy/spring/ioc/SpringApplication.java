package com.zy.spring.ioc;

import com.zy.spring.ioc.dao.UserDao;
import com.zy.spring.ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("IoC容器已初始化===========");
//        UserDao userDao = context.getBean("userDao", UserDao.class);
//        UserDao userDao1 = context.getBean("userDao", UserDao.class);
//        UserDao userDao2 = context.getBean("userDao", UserDao.class);
//        UserDao userDao3 = context.getBean("userDao", UserDao.class);
        UserService userService = context.getBean("userService", UserService.class);
        UserService userService1 = context.getBean("userService", UserService.class);
        UserService userService2 = context.getBean("userService", UserService.class);

    }
}
