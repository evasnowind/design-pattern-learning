package com.prayerlaputa.pattern.creational.abstractfactory;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
