package com.prayerlaputa.pattern.behavioral.command;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
