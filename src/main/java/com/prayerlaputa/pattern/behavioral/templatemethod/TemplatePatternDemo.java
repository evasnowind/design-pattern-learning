package com.prayerlaputa.pattern.behavioral.templatemethod;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
