package com.frankie.demo.beans;

import com.frankie.demo.pojos.Person;

/**
 * @author: Yao Frankie
 * @date: 2020/2/23 10:17
 */
public abstract class ShowMeBean {

    public abstract Person getBean();

    public void showMe(){
        this.getBean().showMe();
    }
}
