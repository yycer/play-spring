package com.frankie.demo;

import com.frankie.demo.proxy.*;
import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author: Yao Frankie
 * @date: 2020/2/26 20:12
 */
@SpringBootTest
public class ProxyTest {

    @Test
    void staticProxyTest(){
        BcOrder bcOrder = new BcOrder();
        BcOrderProxy bcOrderProxy = new BcOrderProxy(bcOrder);
        bcOrderProxy.createOrder();
    }

    @Test
    void dynamicProxyTest(){
        LocalDateTime start = LocalDateTime.now();
        BcOrder bcOrder = new BcOrder();
        Object proxyInstance = Proxy.newProxyInstance(
                BcOrder.class.getClassLoader(),
                BcOrder.class.getInterfaces(),
                new BcOrderDynamicProxy(bcOrder));
        Order strongerBcOrder = (Order) proxyInstance;
        strongerBcOrder.createOrder();
        LocalDateTime end = LocalDateTime.now();
        // cost 2000000 ns.
        System.out.println("cost " + Duration.between(start, end).toNanos() + " ns.");
    }

    @Test
    void createProxyClassTest() throws IOException {
        byte[] bytes = ProxyGenerator.generateProxyClass("MyProxyClass", new Class[]{Order.class});
        File file = new File("C:/Users/Administrator/Desktop/MyProxyClass2.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.flush();
        fos.close();
    }

    @Test
    void cglibProxyTest(){
        LocalDateTime start = LocalDateTime.now();
        BcOrder bcOrder = new BcOrder();
        BcOrderCglibProxy proxy = new BcOrderCglibProxy(bcOrder);
        Order order = (Order) Enhancer.create(BcOrder.class, proxy);
        order.createOrder();
        LocalDateTime end = LocalDateTime.now();
        // cost 65000000 ns.
        System.out.println("cost " + Duration.between(start, end).toNanos() + " ns.");

//        BcOrder bcOrder1 = new BcOrder();
        Order bcOrder1 = new BcOrder();
    }
}
