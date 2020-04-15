package com.frankie.demo.utils;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Yao Frankie
 * @date: 2020/4/14 22:13
 */
public class MyClassPathXmlAC extends ClassPathXmlApplicationContext {

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        super.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }
}
