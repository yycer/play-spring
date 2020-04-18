package com.frankie.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: Yao Frankie
 * @date: 2020/4/18 16:24
 */
@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.test(..))")
    public void test(){

    }

    @Before("test()")
    public void beforeTest(){
        System.out.println("Doing something before test().");
    }

    @After("test()")
    public void afterTest(){
        System.out.println("Doing something after test().");
    }
}
