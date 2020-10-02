package com.prayerlaputa.pattern.creational.builder;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
