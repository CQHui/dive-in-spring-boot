package com.qihui.autoconfigure.annotation;

import org.springframework.cache.annotation.CachingConfigurationSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({HelloWorldImportSelector.class})
public @interface EnableHelloWorld {
}
