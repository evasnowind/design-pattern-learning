package com.prayerlaputa.pattern.creational.abstractfactory;

import com.prayerlaputa.pattern.creational.factory.Shape;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
