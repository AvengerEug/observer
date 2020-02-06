package com.eugene.sumarry.observer1.observer.impl;

import com.eugene.sumarry.observer1.observer.MakeOrderObserver;

/**
 * 添加下单主题的短信观察者
 */
public class SMSObserver implements MakeOrderObserver {

    public void update() {
        System.out.println("短信观察者收到通知, 处理发送短信逻辑");
    }
}
