package com.frankie.demo.pojos;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 10:18
 */
public class Teacher extends Person {

    public Teacher(String name, String id) {
        super(name, id);
    }

    @Override
    public void showMe(){
        System.out.println("l am a teacher.");
    }
}
