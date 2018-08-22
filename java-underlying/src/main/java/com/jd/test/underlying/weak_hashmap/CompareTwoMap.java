package com.jd.test.underlying.weak_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：测试 WeakHashMap 和 HashMap 差异
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/8/8 15:25
 */
public class CompareTwoMap {

//    private static Map<String, String> whm = new WeakHashMap<String, String>();
//    private static Map<String, String> hm = new HashMap<String, String>();

    public static void main(String[] args) {

        Map<String, String> whm = new WeakHashMap<String, String>();
        Map<String, String> hm = new HashMap<String, String>();

        //赋值
        String k1 = new String("1");
        String v1 = new String("v1");

        String k2 = new String("2");
        String v2 = new String("v2");

        String k3 = new String("3");
        String v3 = new String("v3");

        String k4 = new String("4");
        String v4 = new String("v4");

        whm.put(k1, v1);
        whm.put(k2, v2);

        hm.put(k3, v3);
        hm.put(k4, v4);
        //迭代
        System.out.println("... WeakHashMap value ...");
        for (Map.Entry<String, String> entry : whm.entrySet()) {

            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        System.out.println("... HashMap value ...");
        for (Map.Entry<String, String> entry : hm.entrySet()) {

            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        //垃圾回收
        // 将k1设置null。
        // 这意味着“弱键”k1再没有被其它对象引用，调用gc时会回收WeakHashMap中与“k1”对应的键值对
        k1 = null;
        k3 = null;
        System.out.println("k1:"+k1);
        System.out.println("k1:"+k3);
        System.gc();

        System.out.println("========================== 华丽的分割线 =========================");

        //再迭代
        System.out.println("... WeakHashMap value ...");
        for (Map.Entry<String, String> entry : whm.entrySet()) {

            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        System.out.println("... HashMap value ...");
        for (Map.Entry<String, String> entry : hm.entrySet()) {

            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }
//        System.out.println(whm.size());
    }


}
