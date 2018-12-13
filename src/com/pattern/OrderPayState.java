package com.pattern;

/**
 * 订单支付
 */
public class OrderPayState extends State {

    public OrderPayState(int owner_order_status, State next_state) {
        super(owner_order_status, next_state);
    }

    @Override
    void diaplay() {
        System.out.println("订单支付");
    }
}
