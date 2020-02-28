package com.frankie.demo.implAndInter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/28 08:13
 */
public class Frankie implements IPerson {

    public final String name = "frankie";

    @Override
    public void eat() {
        System.out.println("l like eating vegetables.");
    }

    @Override
    public void sleep() {
        System.out.println("l sleep well.");
    }

    public void read(){
        System.out.println("l like reading.");
    }
}
