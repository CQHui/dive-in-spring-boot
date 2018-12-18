package com.qihui.springapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenqihui
 * @date 2018/12/18
 */
public class SpringApplicationEventBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.addApplicationListener(event -> System.out.println("监听到事件" + event));

        context.refresh();
        context.close();

    }
}
