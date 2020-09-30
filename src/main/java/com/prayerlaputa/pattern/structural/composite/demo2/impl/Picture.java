package com.prayerlaputa.pattern.structural.composite.demo2.impl;

import com.prayerlaputa.pattern.structural.composite.demo2.Component;

/**
 * @author chenglong.yu
 * created on 2020/10/4
 */
public class Picture extends Component {
    public Picture(String name, String val) {
        super(name, val);
    }

    @Override
    public void print() {
        super.print(this.getClass().getSimpleName(), this.val);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }
}
