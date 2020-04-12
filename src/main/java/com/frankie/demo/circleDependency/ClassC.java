package com.frankie.demo.circleDependency;

import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/12 15:33
 */
@Setter
public class ClassC {

    public ClassA a;

    public ClassC(){}

    public ClassC(ClassA a){
        this.a = a;
    }

    public void methodC(){
        a.methodA();
        System.out.println("Execute methodC().");
    }
}
