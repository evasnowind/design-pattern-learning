package com.prayerlaputa.pattern.behavioral.strategy;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
