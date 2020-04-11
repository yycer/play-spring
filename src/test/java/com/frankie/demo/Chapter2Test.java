package com.frankie.demo;

import com.frankie.demo.aware.User;
import com.frankie.demo.aware.User2;
import com.frankie.demo.beanTags.Car;
import com.frankie.demo.beans.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: Yao Frankie
 * @date: 2020/4/11 09:14
 */
@SpringBootTest
public class Chapter2Test {

    @Test
    public void basicTest(){
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        Assert.assertEquals(myTestBean.getTest(), "test");
    }

    @Test
    public void beanNameAwareTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("BeanNameAwareTest.xml");
        User user   = ac.getBean(User.class);
        User2 user2 = ac.getBean(User2.class);
        System.out.println(user);
        System.out.println(user2);
    }

    @Test
    public void staticFactoryMethodTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("StaticFactoryMethod.xml");
        Car volvo = (Car) ac.getBean("volvo");
        System.out.println(volvo);

        Car tesla = (Car) ac.getBean("tesla");
        System.out.println(tesla);
    }

    @Test
    public void instanceFactoryMethodTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("InstanceFactoryMethod.xml");
        Car bmw = (Car) ac.getBean("BMW");
        System.out.println(bmw);

        Car mini = (Car) ac.getBean("mini");
        System.out.println(mini);
    }
}
