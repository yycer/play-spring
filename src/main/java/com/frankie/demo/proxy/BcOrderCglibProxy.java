package com.frankie.demo.proxy;

import ch.qos.logback.core.encoder.EchoEncoder;
import javafx.beans.binding.ObjectExpression;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Yao Frankie
 * @date: 2020/2/27 20:05
 */
public class BcOrderCglibProxy implements MethodInterceptor {

    private Object origin;

    public BcOrderCglibProxy(Object origin){
        this.origin = origin;
    }

    /**
     *
     * @param o: the enhanced object.
     * @param method: the intercepted method.
     * @param objects argument array; primitive types are wrapped
     * @param methodProxy: used to invoke super (non-intercepted method);
     * @return: the result of method.
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects, MethodProxy methodProxy) throws Throwable {
        beforeCreateOrder();
        Object ret = method.invoke(origin, objects);
        afterCreateOrder();
        return ret;
    }

    public void beforeCreateOrder(){
        System.out.println("Start beforeCreateOrder().");
    }

    public void afterCreateOrder(){
        System.out.println("Start afterCreateOrder().");
    }
}
