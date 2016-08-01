package com.ucfpay.config;

import com.ucfpay.LoginServiceImpl2;
import com.ucfpay.config.annotation.Export;
import com.ucfpay.config.annotation.Source;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.*;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lenovo on 2016/7/1.
 */



@Component
//@Aspect
public class AnnotationParser implements BeanPostProcessor{

    @Pointcut(value="@annotation(com.ucfpay.config.annotation.Source)")
    public void source(){
    }

    @Before("source()")
    public void beforeAdvice(ProceedingJoinPoint  joinPoint) {

        System.out.println("pointcut source() @Before...");
        try {
          Object ret=joinPoint.proceed();
            System.out.println(ret);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(s.equals("loginServiceImpl"))  {
            return new LoginServiceImpl2();
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
