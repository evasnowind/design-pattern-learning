package com.prayerlaputa.pattern.behavioral.observer;

/**
 * @author chenglong.yu
 * created on 2020/10/7
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
