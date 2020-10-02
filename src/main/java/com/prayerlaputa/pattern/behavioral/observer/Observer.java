package com.prayerlaputa.pattern.behavioral.observer;

/**
 * @author chenglong.yu
 * created on 2020/10/7
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
