package com.frankie.demo.pojos;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/2/24 19:33
 */
@Setter
@Getter
public class Car {
    private String brand;
    private int    speed;
    private double price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
