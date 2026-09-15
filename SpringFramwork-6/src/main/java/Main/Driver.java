package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;
import demo1.Car;
import demo1.Employee;



public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);

		
		 Employee e = (Employee)con.getBean("getEmployee");
		 System.out.println(e);
		   
		
	}

}
