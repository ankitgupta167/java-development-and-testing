package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;
import demo1.Car;



public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);
		Car d=(Car)con.getBean("car");
		
		d.e.run();
	}

}
