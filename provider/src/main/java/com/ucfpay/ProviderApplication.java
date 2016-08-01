package com.ucfpay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

import java.util.List;

//@SpringBootApplication
public class ProviderApplication {

	public static void main(String[] args) {
		//ClassPathScanningCandidateComponentProvider
		//ClassPathBeanDefinitionScanner
		//BeanFactory
		//BeanDefinition
		//ApplicationContext
		//

		//SpringApplication.run(ProviderApplication.class, args);

		List<String> list=null;
		for (String s:list){
			System.out.println(s);
		}
	}
}
