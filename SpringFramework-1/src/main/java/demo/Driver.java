//package demo;
//
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class Driver {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext con= new AnnotationConfigApplicationContext("config.xml");
//		Student s=(Student)con.getBean("stu");
//
//		System.out.println(s);
//		s.study();
//		
//		
//	}
//}
package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ConfigurableApplicationContext con =
                new ClassPathXmlApplicationContext("config.xml");

        Student s = (Student) con.getBean("stu");

        System.out.println(s);

        s.study();

        con.close();
    }
}