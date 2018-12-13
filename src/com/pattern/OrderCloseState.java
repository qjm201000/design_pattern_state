package com.pattern;

/**
 * 订单状态关闭
 */
public class OrderCloseState extends State{
    public OrderCloseState(int owner_order_status, State next_state) {
        super(owner_order_status, next_state);
    }

    @Override
    void diaplay() {
        System.out.println("订单状态关闭");
    }
}
