package com.frankie.demo.pojos;

/**
 * @author: Yao Frankie
 * @date: 2020/2/25 20:09
 */
public class StudentFactory {

    public StudentFactory(){
        System.out.println("Started StudentFactory.");
    }

    public Student getInstance(){
        return new Student();
    }
}
