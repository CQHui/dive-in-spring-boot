package com.qihui.autoconfigure.annotation;

import java.lang.annotation.*;

/**
 * 二级
 *
 * {@link FirstLevelRepository @FirstLevelRepository}
 * @author chenqihui
 * @date 2018/12/17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
