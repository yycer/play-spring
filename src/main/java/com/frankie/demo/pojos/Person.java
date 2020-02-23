package com.frankie.demo.pojos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 10:17
 */
@Setter
@Getter
public class Person {

    public Person(String name, String id){
        this.name = name;
        this.id   = id  ;
    }

    private String name;
    private String id;

    public void showMe(){
        System.out.println("l am a person.");
    }

    @Override
    public String toString(){
        return String.format("name = %s, id = %s", name, id);
    }
}
