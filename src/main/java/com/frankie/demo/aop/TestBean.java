package com.frankie.demo.aop;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/18 16:23
 */
@Setter
@Getter
public class TestBean {
    private String testStr = "testStr";

    public void test(){
        System.out.println("test");
    }
}
