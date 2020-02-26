package com.frankie.demo.proxy;

/**
 * @author: Yao Frankie
 * @date: 2020/2/26 20:10
 */
public class BcOrderProxy{

    private BcOrder bcOrder;

    public BcOrderProxy(BcOrder bcOrder){
        this.bcOrder = bcOrder;
    }

    public void createOrder() {
        beforeCreateOrder();
        bcOrder.createOrder();
        afterCreateOrder();
    }

    public void beforeCreateOrder(){
        System.out.println("Start beforeCreateOrder().");
    }

    public void afterCreateOrder(){
        System.out.println("Start afterCreateOrder().");
    }
}
