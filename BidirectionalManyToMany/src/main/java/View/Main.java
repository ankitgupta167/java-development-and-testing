
package View;


import java.util.ArrayList;
import java.util.List;

import Repository.StudentRepository;
import entity.Course;
import entity.Student;

public class Main {

	public static void main(String[] args) {
		 StudentRepository r=new StudentRepository();
		
			Course c1=new Course("java",10000);
			Course c2=new Course("Python",10000);
			Course c3=new Course("sql",8000);
			
		List<Course> courses1=new ArrayList<Course>();
		courses1.add(c2);
		courses1.add(c3);
		
		List<Course> courses2=new ArrayList<Course>();
		courses2.add(c1);
		courses2.add(c1);
		
		List<Course> courses3=new ArrayList<Course>();
		courses3.add(c2);
		
		
			
			Student s1=new Student("abc",20);
			Student s2=new Student("xyz",21);
			Student s3=new Student("pqr",22);
			
			
			List<Student> student1=new ArrayList<Student>();
			student.add(s1);
			student.add(s3);
			List<Student> student1=new ArrayList<Student>();
			student.add(s1);
			student.add(s3);
			List<Student> student1=new ArrayList<Student>();
			student.add(s1);
			student.add(s2);
			
			List<Course>courses=new ArrayList<Course>();
			courses.add(c1);
			courses.add(c2);
			courses.add(c3);
			
			r.saveStudent(s2, courses2);

			r.saveStudent(s3, courses3);


			
		
	}

}
