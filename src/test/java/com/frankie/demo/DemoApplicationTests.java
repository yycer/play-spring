package com.frankie.demo;

import com.frankie.demo.beans.MyTestBean;
import com.frankie.demo.beans.ShowMeBean;
import com.frankie.demo.pojos.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("spring");
    }

    @Test
    public void beanTest(){
        ClassPathResource resource = new ClassPathResource("/beanFactoryTest.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
        Assert.assertEquals(myTestBean.getTest(), "test");
    }

    @Test
    public void userDefinedLabelTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("UserBean.xml");
        User user = (User) context.getBean("userBean");
        System.out.println(String.format("name = %s, age = %d", user.getUserName(), user.getAge()));
    }

    @Test
    void playLabels(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("OrderBean.xml");
//        Order order = (Order) context.getBean("order");
        Order order = (Order) context.getBean("myOrder");
        System.out.println(order);
    }

    @Test
    void lookupMethodTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ShowMeBean.xml");
        ShowMeBean showMeBean = (ShowMeBean) context.getBean("showMeBean");
        showMeBean.showMe();
    }

    @Test
    void replaceMethodTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ReplaceMethodBean.xml");
        Programmer programmer = (Programmer) context.getBean("testReplaceMethod");
        programmer.showMe();
    }

    @Test
    void constructorArgTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("PersonBean.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    @Test
    void importXmlTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanCollection.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    @Test
    void factoryBeanTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CarBean.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(1);
    }
}
