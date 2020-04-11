package com.frankie.demo.beanTags;

import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yao Frankie
 * @date: 2020/4/11 18:40
 */
@Setter
public class CarInstanceFactory {

    private Map<Integer, Car> carMap = new HashMap<>();

    public Car getCar(int id){
        return carMap.get(id);
    }
}
