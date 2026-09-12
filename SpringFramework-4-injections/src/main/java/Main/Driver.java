package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;
import test.Person;


public class Driver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);
		
		Person e=(Person)con.getBean("person");
		
		System.out.println(e);
		
	}

}
