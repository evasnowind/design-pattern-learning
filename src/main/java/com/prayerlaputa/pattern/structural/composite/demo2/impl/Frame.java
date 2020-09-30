package com.prayerlaputa.pattern.structural.composite.demo2.impl;

import com.prayerlaputa.pattern.structural.composite.demo2.Component;
import java.util.ArrayList;

/**
 * @author chenglong.yu
 * created on 2020/10/4
 */
public class Frame extends Component {

    private ArrayList<Component> componentList = new ArrayList<>();

    public Frame(String name, String val) {
        super(name, val);
    }

    @Override
    public void print() {
        super.print(this.getClass().getSimpleName(), this.val);
        for (Component component : componentList) {
            component.print();
        }
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }
}
