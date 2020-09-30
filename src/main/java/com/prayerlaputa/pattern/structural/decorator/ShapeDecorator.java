package com.prayerlaputa.pattern.structural.decorator;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
    }
}
