package com.frankie.demo;

import com.frankie.demo.beans.Student;
import com.frankie.demo.circleDependency.ClassA;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

/**
 * @author: Yao Frankie
 * @date: 2020/4/12 15:38
 */
@SpringBootTest
public class CircleDependencyTest {

    @Test
    void constructorCDTest(){
        new ClassPathXmlApplicationContext("ConstructorCD.xml");
        // Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException:
        // Error creating bean with name 'classA': Requested bean is currently in creation:
        // Is there an unresolvable circular reference?
    }

    @Test
    void setterCDTest(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("SetterCD.xml");
        ac.setAllowCircularReferences(false);
        ac.refresh();
        ClassA classA = (ClassA) ac.getBean("classA");
        classA.methodA();
        // Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException:
        // Error creating bean with name 'classA': Requested bean is currently in creation:
        // Is there an unresolvable circular reference?
    }

    @Test
    void prototypeCDTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("PrototypeCD.xml");
        ClassA classA = (ClassA) ac.getBean("classA");
        classA.methodA();
        // Caused by: org.springframework.beans.factory.BeanCurrentlyInCreationException:
        // Error creating bean with name 'classA': Requested bean is currently in creation:
        // Is there an unresolvable circular reference?
    }

    @Test
    void getSpringVersion(){
        System.out.println(SpringVersion.getVersion());
    }

    @Test
    void doCreateBeanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Student.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
}
