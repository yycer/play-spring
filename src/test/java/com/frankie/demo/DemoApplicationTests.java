package com.frankie.demo;

import com.frankie.demo.beans.MyTestBean;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
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

}
