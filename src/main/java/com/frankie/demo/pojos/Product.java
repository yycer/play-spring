package com.frankie.demo.pojos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/22 21:12
 */
@Setter
@Getter
public class Product {
    private String name;
    private String price;

    public Product(){
        System.out.println("Started Product().");
    }

    @Override
    public String toString(){
        return String.format("name = %s, price = %s", name, price);
    }
}
