package com.eugene.sumarry.observer.observer.impl;

import com.eugene.sumarry.observer.observer.MakeOrderObserver;

/**
 * 添加下单主题的库存观察者
 */
public class StockObserver implements MakeOrderObserver {

    public void update() {
        System.out.println("库存观察者收到通知, 处理减少库存逻辑");
    }
}
