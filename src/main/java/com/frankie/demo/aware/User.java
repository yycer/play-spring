package com.frankie.demo.aware;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author: Yao Frankie
 * @date: 2020/4/11 10:17
 */
@Setter
@Getter
public class User implements BeanNameAware {

    private String id;
    private String name;

    /**
     *
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        id = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
