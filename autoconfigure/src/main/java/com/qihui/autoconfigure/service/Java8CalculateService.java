package com.qihui.autoconfigure.service;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;


/**
 * java8 lambda实现 {@link CalculateService}
 * @author chenqihui
 * @date 2018/12/17
 */
@Profile("Java8")
@Service("CalculateService")
public class Java8CalculateService implements CalculateService {
    @Override
    public int sum(int... values) {
        System.out.println("Java8实现");
        return Arrays.stream(values).reduce(0, (a, b) -> a + b);
    }
}
