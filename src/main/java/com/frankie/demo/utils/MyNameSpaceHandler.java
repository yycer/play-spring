package com.frankie.demo.utils;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author: Yao Frankie
 * @date: 2020/2/18 13:35
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
