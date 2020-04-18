package com.frankie.demo;

import com.frankie.demo.aop.TestBean;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/4/18 16:30
 */
@SpringBootTest
public class AOPTest {

    @Test
    public void firstTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("AspectTest.xml");
        TestBean testBean = (TestBean) ac.getBean("test");
        testBean.test();
    }
}
