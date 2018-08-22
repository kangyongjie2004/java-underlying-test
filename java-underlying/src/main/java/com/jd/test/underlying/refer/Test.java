package com.jd.test.underlying.refer;

public class Test {
    public static void main(String[] args) {

        String s="a";

        strChange(s);

        System.out.println(s);

//        System.out.println(Math.sqrt(111));
    }
    private static void strChange(String s){
        s = "b";
    }
}
