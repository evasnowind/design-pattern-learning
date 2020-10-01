package com.prayerlaputa.pattern.creational.abstractfactory;

import com.prayerlaputa.pattern.creational.factory.Circle;
import com.prayerlaputa.pattern.creational.factory.Rectangle;
import com.prayerlaputa.pattern.creational.factory.Shape;
import com.prayerlaputa.pattern.creational.factory.Square;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
