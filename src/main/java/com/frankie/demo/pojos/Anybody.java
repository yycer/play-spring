package com.frankie.demo.pojos;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 10:34
 */
public class Anybody implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("Maybe anyone.");
        return null;
    }
}
