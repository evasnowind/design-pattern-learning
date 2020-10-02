package com.prayerlaputa.pattern.creational.prototype;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
