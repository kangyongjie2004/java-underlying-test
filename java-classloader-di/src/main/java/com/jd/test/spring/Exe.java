package com.jd.test.spring;

import com.jd.test.beans.ITest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：测试spring依赖通过不同的类加载器获取不到。
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/5 10:30
 */
public class Exe {

//    private static ApplicationContext testContext = new ClassPathXmlApplicationContext("spring-config.xml");


    public static void main(String args[]) throws Exception {
//        ITest test = (ITest) testContext.getBean(ITest.class);
//        System.out.println(test.getName());

        String jarFile = "java-classloader-di-1.0-SNAPSHOT.jar";
        String jarPath = System.getProperty("user.dir")+"\\java-classloader-di\\test_dir\\"+jarFile;

        System.out.println(jarPath);

        File file1 = new File(jarPath);
        URI uri1=file1.toURI();
        URL[] urls1={uri1.toURL()};
//        ClazzLoader cl2 = new ClazzLoader(urls1, ClassLoader.getSystemClassLoader());
        ClazzLoader cl2 = new ClazzLoader(urls1, Thread.currentThread().getContextClassLoader());

//        Class clazz = cl2.loadClass("com.jd.test.beans.Test");
//        System.out.println("### class name:"+clazz.getName());

        ApplicationContext testContext = new ClassPathXmlApplicationContext("spring-config.xml");

        ITest test = (ITest) testContext.getBean(ITest.class);
        System.out.println(test.getName());
    }
    public static class ClazzLoader extends URLClassLoader {
        public ClazzLoader(URL[] urls, ClassLoader parent) {
            super(urls, parent);
        }
    }
}
