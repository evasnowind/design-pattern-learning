package com.prayerlaputa.pattern.creational.factory;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
