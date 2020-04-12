package com.frankie.demo.circleDependency;

import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/12 15:33
 */
@Setter
public class ClassA {

    public ClassB b;

    public ClassA(){}

    public ClassA(ClassB b){
        this.b = b;
    }

    public void methodA(){
        b.methodB();
        System.out.println("Execute methodA().");
    }
}
