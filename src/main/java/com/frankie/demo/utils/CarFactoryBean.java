package com.frankie.demo.utils;

import com.frankie.demo.pojos.Car;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Yao Frankie
 * @date: 2020/2/24 19:33
 */
@Setter
@Getter
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        String[] carInfo = this.carInfo.split(";");
        Car car = new Car();
        car.setBrand(carInfo[0]);
        car.setSpeed(Integer.parseInt(carInfo[1]));
        car.setPrice(Double.parseDouble(carInfo[2]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
