package com.learning.springframework.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
	
	public static void main(String[] args) {
		
		//1: Launch a spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//2: Configure the things that we want spring to manage - 
		//HelloWorldConfiguration - @Configuration
		//name - @Bean
		
		//3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
		
		System.out.println(context.getBean("address2"));
		
		//System.out.println(context.getBean(Address.class));
		
		//System.out.println
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}

//Spring Container: Manages Spring beans & their lifecycle
//1. Bean factory: Basic Spring Container
//2. Applicaton Context: Advanced Spring Container with enterprise-specific Features
//Easy to use in web applications
//Easy internationalization
//Easy integration with Spring AOP


/*
 Java Bean: Classes adhering to 3constraints:
 1. have public default(no argument)constructors
 2. allow access to their properties using getter and setter methods
 3. Implement java.io.Serializable
 
 POJO: plain old java object
 1. No constraints
 2. Any java object is a pojo
 
 Spring Bean: Any java object that is managed by spring
 1. Spring uses IOC container(Bean factory or Application Context)to manage these objects.
 
 */
