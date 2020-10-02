package com.prayerlaputa.pattern.creational.prototype;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
