package com.qihui.autoconfigure.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * java7 for 循环实现 {@link CalculateService}
 * @author chenqihui
 * @date 2018/12/17
 */
@Profile("Java7")
@Service("CalculateService")
public class Java7CalculateService implements CalculateService {
    @Override
    public int sum(int... values) {
        System.out.println("Java7实现");
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
