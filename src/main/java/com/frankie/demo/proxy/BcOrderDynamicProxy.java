package com.frankie.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Yao Frankie
 * @date: 2020/2/26 21:12
 */
public class BcOrderDynamicProxy implements InvocationHandler {

    private BcOrder bcOrder;

    public BcOrderDynamicProxy(BcOrder bcOrder){
        this.bcOrder = bcOrder;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeCreateOrder();
        Object invokedObject = method.invoke(bcOrder, args);
        afterCreateOrder();
        return invokedObject;
    }

    public void beforeCreateOrder(){
        System.out.println("Start beforeCreateOrder().");
    }

    public void afterCreateOrder(){
        System.out.println("Start afterCreateOrder().");
    }
}
