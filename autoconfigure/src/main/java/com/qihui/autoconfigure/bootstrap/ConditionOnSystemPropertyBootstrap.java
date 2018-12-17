package com.qihui.autoconfigure.bootstrap;

import com.qihui.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
public class ConditionOnSystemPropertyBootstrap {

    @Bean
    @ConditionalOnClass(name = "user.name", value = "qihui")
    public String helloWorld() {
        return "Hello,World 2018";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(ConditionOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = run.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean : " + helloWorld);

        run.close();

    }

}
