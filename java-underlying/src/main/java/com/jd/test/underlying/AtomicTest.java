package com.jd.test.underlying;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：测试 Atomic
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/31 10:25
 */
public class AtomicTest {

    private static AtomicBoolean started = new AtomicBoolean(false);

    public static void main(String[] args) {
        System.out.println(started.compareAndSet(true,false));
    }
}
