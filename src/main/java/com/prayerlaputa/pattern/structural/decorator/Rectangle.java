package com.prayerlaputa.pattern.structural.decorator;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
