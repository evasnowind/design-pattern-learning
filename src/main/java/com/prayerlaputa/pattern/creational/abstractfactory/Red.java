package com.prayerlaputa.pattern.creational.abstractfactory;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
