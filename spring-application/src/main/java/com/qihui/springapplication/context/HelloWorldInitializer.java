package com.qihui.springapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author chenqihui
 * @date 2018/12/18
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C applicationContext) {
        System.out.println("HelloWorldInitializer 初始化" + applicationContext.getId());
    }
}
