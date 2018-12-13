package com.pattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        State orderState = order.getOrderState();
        orderState.handler(1);//订单创建
        orderState.handler(2);//订单支付
        orderState.handler(3);//订单完成
        orderState.handler(4);//订单关闭
        orderState.handler(5);//订单未定义
    }
}
