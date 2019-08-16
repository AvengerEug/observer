package com.eugene.sumarry.observer.subject;

import com.eugene.sumarry.observer.observer.MakeOrderObserver;

/**
 * 下订单主题:
 *   短信模块, 库存模块等其他业务模块都会订阅它
 */
public interface MakeOrderSubject {

    void register(MakeOrderObserver makeOrderObserver);

    void remove(MakeOrderObserver makeOrderObserver);

    void notifyObserver();
}
