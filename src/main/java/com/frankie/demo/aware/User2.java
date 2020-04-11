package com.frankie.demo.aware;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/4/11 10:18
 */
@Setter
@Getter
public class User2 {

    private String id;
    private String name;

    @Override
    public String toString() {
        return "User2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
