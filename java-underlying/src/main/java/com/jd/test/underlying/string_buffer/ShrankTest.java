package com.jd.test.underlying.string_buffer;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：测试删掉末尾字符。
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/8/14 15:29
 */
public class ShrankTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");

        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append("e");

        sb.setLength(sb.length() - 1);

        sb.append("f");

        System.out.println(sb);
    }
}
