package com.prayerlaputa.pattern.creational.prototype;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
