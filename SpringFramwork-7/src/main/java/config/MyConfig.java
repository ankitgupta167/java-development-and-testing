package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import demo1.Employee;

@Configuration
@ComponentScan(basePackages = {"demo1"})
public class MyConfig {


}
