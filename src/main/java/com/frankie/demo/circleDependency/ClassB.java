package com.frankie.demo.circleDependency;

import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/12 15:33
 */
@Setter
public class ClassB {

    public ClassC c;

    public ClassB(){}

    public ClassB(ClassC c){
        this.c = c;
    }

    public void methodB(){
        c.methodC();
        System.out.println("Execute methodB().");
    }
}
