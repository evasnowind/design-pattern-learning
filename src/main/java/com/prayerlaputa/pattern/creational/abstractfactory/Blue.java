package com.prayerlaputa.pattern.creational.abstractfactory;


/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
