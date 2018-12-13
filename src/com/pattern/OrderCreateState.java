package com.pattern;

/**
 * 订单创建
 */
public class OrderCreateState extends State
{
    public OrderCreateState(int owner_order_status, State next_state) {
        super(owner_order_status, next_state);
    }

    @Override
    void diaplay() {
        System.out.println("订单创建");
    }
}
