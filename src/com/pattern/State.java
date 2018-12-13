package com.pattern;

/**
 * 状态接口类
 */
public abstract class State {
    protected int owner_order_status = 0;//当前状态对象的具体状态
    protected State next_state;//当前状态的下一个状态
    public State(int owner_order_status,State next_state){
        this.owner_order_status = owner_order_status;
        this.next_state = next_state;
    }

    /**
     * 处理
     * @param orderStatus
     */
    protected  void handler(int orderStatus){
        if(!isOwner(owner_order_status,orderStatus)){
            if(next_state != null){
                //非当前对象，继续到下一个对象中查找
                next_state.handler(orderStatus);
                return;
            }
            System.out.println("当前订单状态未定义");
            return;
        }
        diaplay();
    }

    /**
     * 是否当前对象
     * @return
     */
    public boolean isOwner(int owner_order_status,int orderStatus){
        if(owner_order_status == orderStatus){
            return true;
        }
        return false;
    }

    abstract void diaplay();
}
