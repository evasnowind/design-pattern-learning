package com.prayerlaputa.pattern.behavioral.iterator;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
