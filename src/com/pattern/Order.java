package com.pattern;

/**
 * 订单
 */
public class Order {
    private State orderState;
    public Order(){
        orderState = new OrderCreateState(1,
                new OrderPayState(2,
                        new OrderSuccessState(3,
                                new OrderPayState(4,null))));
    }

    public State getOrderState() {
        return orderState;
    }
}
