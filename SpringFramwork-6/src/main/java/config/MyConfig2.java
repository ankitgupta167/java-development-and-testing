package config;

import org.springframework.context.annotation.Bean;

import demo1.Car;

public class MyConfig2 {

	@Bean
	public Car getEmployee() {
		return new Car();
	}
}
