package com.pattern;

/**
 * 订单完成
 */
public class OrderSuccessState extends State{
    public OrderSuccessState(int owner_order_status, State next_state) {
        super(owner_order_status, next_state);
    }

    @Override
    void diaplay() {
        System.out.println("订单完成");
    }
}
