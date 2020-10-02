package com.prayerlaputa.pattern.creational.builder;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
