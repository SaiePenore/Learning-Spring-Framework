package com.learning.springframework.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor, 
//equals, hashcode, and to string are automatically created.
//Released in JDK 16.

record Person(String name, int age, Address address) {}
record Address(String firstline, String city) {}

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Saie";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		
		return new Person("Ravi",20, new Address("Main Street","Utrecht"));
		//var person = new Person("Ravi",20);
		//return person;
			
	}
	
	@Bean
	public Person person2MethodCall() {
		
		return new Person(name(),age(), address()); //name, age	
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3 ) {
		
		return new Person(name, age, address3); //name, age	
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Baker street","Landon");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("Moti nagar","Haydrabad");
	}
}

