package com.prayerlaputa.pattern.behavioral.strategy;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
