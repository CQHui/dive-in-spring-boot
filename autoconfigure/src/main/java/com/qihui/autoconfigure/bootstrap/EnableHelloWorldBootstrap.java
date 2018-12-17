package com.qihui.autoconfigure.bootstrap;

import com.qihui.autoconfigure.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
@EnableHelloWorld
@ComponentScan("com.qihui.autoconfigure.repository")
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // helloWorld Bean 是否存在
        String helloWorld =
                run.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean : " + helloWorld);

        run.close();

    }
}
