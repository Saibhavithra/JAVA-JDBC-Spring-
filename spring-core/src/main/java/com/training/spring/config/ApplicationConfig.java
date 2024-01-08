
package com.training.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.training.spring.Car;
import com.training.spring.Person;
 
@Configuration
public class ApplicationConfig {
	@Bean
	public Person person() {
		Person p1 = new Person();
		p1.setFirstName("hello person config");
		return p1;
	}
	@Bean
	public Car car() {
		Car c1 = new Car();
		c1.setModel("Subaru");
		return c1;
	}
	}