package com.frankie.demo.beans;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/12 19:00
 */
@Setter
@Getter
public class Student {

    private int id;
    private String name;

    public void init(){
        System.out.println("Execute init() method.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
