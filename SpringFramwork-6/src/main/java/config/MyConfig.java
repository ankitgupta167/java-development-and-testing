package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import demo1.Employee;

@Configuration
@Import({MyConfig2.class,MyConfig3.class})
public class MyConfig {
	
@Bean
public Student getCStudent() { // this is called factory method
	return new Student();
}

@Bean
public Employee getEmployee() {
	return new Employee();
}
}
