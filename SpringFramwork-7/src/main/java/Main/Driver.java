package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyConfig;

import demo1.Student;



public class Driver {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext(MyConfig.class);

		

		Student s1 = (Student)con.getBean("stu");
		Student s2 = (Student)con.getBean("stu");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
