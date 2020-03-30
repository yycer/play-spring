package com.frankie.demo.beans;

import com.frankie.demo.pojos.UserService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: Yao Frankie
 * @date: 2020/3/30 22:14
 */
@Component
public class CustomerFactoryBean implements FactoryBean<UserService> {

    @Override
    public UserService getObject() throws Exception {
        return new UserService();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}
