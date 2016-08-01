package com.ucfpay.config.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lenovo on 2016/7/1.
 * 引用远程服务注解
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Remote {
}
