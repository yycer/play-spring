package com.frankie.demo.pojos;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 10:18
 */
public class Programmer extends Person {

    public Programmer(String name, String id) {
        super(name, id);
    }

    @Override
    public void showMe(){
        System.out.println("l am a programmer.");
    }
}
