package com.qihui.autoconfigure.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld() { // 方法名即 Bean 名称
        return "Hello,World 2018";
    }
}
