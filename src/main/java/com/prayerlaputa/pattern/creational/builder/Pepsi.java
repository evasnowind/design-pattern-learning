package com.prayerlaputa.pattern.creational.builder;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
