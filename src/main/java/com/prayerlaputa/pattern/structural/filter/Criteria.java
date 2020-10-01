package com.prayerlaputa.pattern.structural.filter;

import java.util.List;

/**
 * @author chenglong.yu
 * created on 2020/10/6
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
