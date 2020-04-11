package com.frankie.demo.beanTags;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Yao Frankie
 * @date: 2020/4/11 18:30
 */
public class CarStaticFactory {
    private static Map<Integer, Car> carMap = new HashMap<>();

    static {
        carMap.put(1, new Car(1, "volvo", "30"));
        carMap.put(2, new Car(2, "benz",  "50"));
        carMap.put(3, new Car(3, "tesla", "40"));
    }

    public static Car getCar(int id){
        return carMap.get(id);
    }
}
