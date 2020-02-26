package com.frankie.demo;

import com.frankie.demo.proxy.BcOrder;
import com.frankie.demo.proxy.BcOrderDynamicProxy;
import com.frankie.demo.proxy.BcOrderProxy;
import com.frankie.demo.proxy.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Proxy;

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
        BcOrder bcOrder = new BcOrder();
        Order strongerBcOrder = (Order) Proxy.newProxyInstance(
                BcOrder.class.getClassLoader(),
                BcOrder.class.getInterfaces(),
                new BcOrderDynamicProxy(bcOrder));
        strongerBcOrder.createOrder();
    }
}
