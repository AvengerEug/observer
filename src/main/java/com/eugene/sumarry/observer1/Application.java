package com.eugene.sumarry.observer1;

import com.eugene.sumarry.observer1.common.MakeOrderWatch;
import com.eugene.sumarry.observer1.observer.impl.SMSObserver;
import com.eugene.sumarry.observer1.observer.impl.StockObserver;

public class Application {

    private MakeOrderWatch makeOrderWatch;

    {
        // 代码块: 每次创建实例前都会先执行这段代码块

        // 初始化应用, 将短信，库存观察者添加至MakeOrderWatch中
        this.initMakeOrderWatch();
        this.registerObserver();
    }

    private void registerObserver() {
        this.registerSMSObserver();
        this.registerStockObserver();
    }

    private void initMakeOrderWatch() {
        this.makeOrderWatch = new MakeOrderWatch();
    }

    private void registerSMSObserver() {
        this.makeOrderWatch.register(new SMSObserver());
    }

    private void registerStockObserver() {
        this.makeOrderWatch.register(new StockObserver());
    }

    private void makeOrder() {
        try {
            System.out.println("验证下单前置条件");
            Thread.sleep(3000);

            System.out.println("下单完成, 通知短信、库存观察者处理自己的逻辑");
            this.makeOrderWatch.notifyObserver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.makeOrder();
        new Application();
    }
}
