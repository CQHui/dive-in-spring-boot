package com.qihui.autoconfigure.annotation;

import com.qihui.autoconfigure.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author chenqihui
 * @date 2018/12/17
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println(HelloWorldConfiguration.class.getName());
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
