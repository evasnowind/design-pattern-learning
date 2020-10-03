package com.prayerlaputa.pattern.behavioral.command;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
