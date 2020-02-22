package com.frankie.demo;

import com.frankie.demo.beans.MyTestBean;
import com.frankie.demo.pojos.Order;
import com.frankie.demo.pojos.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
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
        Order order = (Order) context.getBean("order");
        System.out.println(order);
    }

}
