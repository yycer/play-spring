package com.frankie.demo.proxy;

/**
 * @author: Yao Frankie
 * @date: 2020/2/26 20:09
 */
public class BcOrder implements Order{


    @Override
    public void createOrder() {
        System.out.println("Created BC Order.");
    }
}
