package com.eugene.sumarry.observer4;

public abstract class MoviceEvent {

    protected String envrionment = "电影院 ";

    // 1. 普通电影
    // 2. 搞笑电影
    // 3. 抒情电影
    protected int moviceType;

    protected abstract void run();

}
