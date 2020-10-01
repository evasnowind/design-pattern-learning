package com.prayerlaputa.pattern.creational.abstractfactory;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
