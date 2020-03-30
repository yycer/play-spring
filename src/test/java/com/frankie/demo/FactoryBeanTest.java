package com.frankie.demo;

import com.frankie.demo.beans.AppConfig;
import com.frankie.demo.pojos.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/3/30 22:17
 */
@SpringBootTest
public class FactoryBeanTest {

    @Test
    void factoryBeanTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
        Object customerFactoryBean = context.getBean("&customerFactoryBean");
        System.out.println(customerFactoryBean);

    }
}
