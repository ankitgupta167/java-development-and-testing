package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.Employee;
import test.Student;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);
		Student s=(Student)con.getBean("student");
		Employee e=(Employee)con.getBean("emp");
		
		System.out.println(e);
		System.out.println(e);
	}
}
