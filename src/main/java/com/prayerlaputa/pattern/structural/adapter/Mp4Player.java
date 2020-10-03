package com.prayerlaputa.pattern.structural.adapter;

/**
 * @author chenglong.yu
 * created on 2020/10/5
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
