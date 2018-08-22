package com.jd.test.underlying.weak_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/8/8 17:04
 */
public class MapKey {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<String,String>();

        String k = new String("1");
        String v = new String("v1");

        m.put(k,v);

        k = null;

        for (Map.Entry<String, String> entry : m.entrySet()) {

            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }


    }
}
