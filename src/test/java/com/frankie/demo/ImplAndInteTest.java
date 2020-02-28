package com.frankie.demo;

import com.frankie.demo.implAndInter.Frankie;
import com.frankie.demo.implAndInter.IPerson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 08:14
 */
@SpringBootTest
public class ImplAndInteTest {

    @Test
    void implementationAndInterfaceTest(){
        Frankie frankie = new Frankie();
        System.out.println("name : " + frankie.name);
        frankie.eat();
        frankie.read();

        ((IPerson) frankie).eat();
//        iFrankie.read();
    }
}
