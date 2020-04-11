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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("spring");
    }

    @Test
    public void beanTest(){
        ClassPathResource resource = new ClassPathResource("/BeanFactoryTest.xml");
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
        context.close();
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

    @Test
    void circleDependencyConstructorTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("CircleDepenConstructorBean.xml");
        TestA testA = (TestA) context.getBean("testA");
        System.out.println(1);
    }

    @Test
    void optionalTest(){
        // Common condition.
//        Map<String, Object> body = new HashMap<>();
//        body.put("status", "1");

        // Special condition1
//        Map<String, Object> body = null;

        // Special condition1
        Map<String, Object> body = new HashMap<>();
//        body.put("status", "1");

        String status = Optional.ofNullable(body).map(x -> (String) x.get("status")).orElse("0");
        System.out.println(status);
    }

    @Test
    void hashMapAddAllTest(){

        HashMap<String, String> parent = new HashMap<>();
        HashMap<String, String> child = new HashMap<>();
        child.put("name", "yyc");
        child.put("age", "25");
        parent.putAll(child);

        System.out.println(parent);

    }

    @Test
    void primaryTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("PrimaryProductBean.xml");
        Product product = context.getBean(Product.class);
        System.out.println(product);
    }

    @Test
    void factoryMethodTest(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("StudentBean.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student.getName());

    }

    @Test
    void parentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ParentBean.xml");
        context.getBean("child");
    }

    @Test
    void dependsOnTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("DependsOnBean.xml");
    }

    @Test
    void ipTest(){

    }
}
