package com.jd.test.underlying.fan_xing;

import java.util.ArrayList;
import java.util.List;

/**
 * PECS: Producer Extends;Consumer Super
 */
public class Generic {
    public static void main(String[] args) {
        List<? extends A> list1 = new ArrayList<>();//集合存放A的子类
//          list1.add(new A()); //错误，编译器无法确定List所持有的类型，所以无法安全的向其中添加对象。
// 因为A的子类太多，具体放哪个不清楚。如果所有子类都能放，违背了泛型的初衷：进行约束。
//          A a = list1.get(0);

        List<? extends A> list2 = new ArrayList<A>();
//        list2.add(new B());//错误，编译器无法确定List所持有的类型，所以无法安全的向其中添加对象

        List<? super B> list3 = new ArrayList<B>();//集合存放B的父类
        list3.add(new B());
//        list3.add(new A());
        System.out.println(list3.get(0).getClass().getName());

        //想要正确，必须向下转型，但是向下转型是不安全的，非常容易出错
//          B b = list3.get(0); //编译器无法确定get返回的对象类型是B,还是B的父类或 Object.
        List<? super B> list4 = new ArrayList<A>();

//        list4.add(new A());

        System.out.println(new B() instanceof Object);
    }
}

class A {
}

class B extends A {
}