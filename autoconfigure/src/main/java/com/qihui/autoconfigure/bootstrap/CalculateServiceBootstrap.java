package com.qihui.autoconfigure.bootstrap;

import com.qihui.autoconfigure.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
@ComponentScan("com.qihui.autoconfigure.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);

        CalculateService calculateService = run.getBean("CalculateService", CalculateService.class);
        System.out.println("calculateService.sum(1...10) : " + calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }


}
