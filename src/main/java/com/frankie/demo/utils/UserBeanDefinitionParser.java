package com.frankie.demo.utils;

import com.frankie.demo.pojos.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author: Yao Frankie
 * @date: 2020/2/18 13:30
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<User> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");

        builder.addPropertyValue("age", Integer.parseInt(age));

        if (StringUtils.hasText(name)){
            builder.addPropertyValue("userName", name);
        }
    }
}
