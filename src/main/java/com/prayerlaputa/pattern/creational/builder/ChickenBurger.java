package com.prayerlaputa.pattern.creational.builder;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
