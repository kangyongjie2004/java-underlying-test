package com.jd.test.underlying.fan_xing;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试java的泛型：super
 */
class Fruit{}
class Apple extends Fruit{}
class Apple1 extends Apple{}
class Orange extends Fruit{}

/**
 *
 * @param <T>
 */
public class TestBuChang<T>{

    public static void main(String[] args) {
        List<? super Apple> list = new ArrayList<>();
        list.add(new Apple());
        list.add(new Apple1());
//        list.add(new Orange());
//        list.add(new Fruit());

        Object apple = list.get(0);
    }
}