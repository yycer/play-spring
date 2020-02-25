package com.frankie.demo.pojos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/22 21:11
 */
@Setter
@Getter
public class Order {
    private String  orderId;
    private String  total;
    private Product product;

    public Order(){
        System.out.println("Started Order().");
    }

    @Override
    public String toString(){
        return String.format("orderId = %s, total = %s, \nproduct: (%s)",
                orderId, total, product.toString());
    }

    public void orderInit(){
        System.out.println("Start orderInit()");
    }

    public void orderDestroy(){
        System.out.println("Start orderDestroy()");
    }
}
