
package View;


import java.util.ArrayList;
import java.util.List;

import Repository.StudentRepository;
import entity.Course;
import entity.Student;

public class Main {
//	static StudentRepository r=new StudentRepository();
	public static void main(String[] args) {
		 StudentRepository r=new StudentRepository();
		System.out.println("1. Add Student");
		System.out.println("2. find the student detail with id");
		System.out.println("3.add extra course in student");
		int option=1;
		switch (option) {
		case 1:
			Course c1=new Course("java",10000);
			Course c2=new Course("Python",10000);
			Course c3=new Course("sql",8000);
			
		List<Course> courses1=new ArrayList<Course>();
		courses1.add(c1);
		courses1.add(c3);
		
		List<Course> courses2=new ArrayList<Course>();
		courses2.add(c2);
		
		List<Course> courses3=new ArrayList<Course>();
		courses3.add(c2);
		
		
			
			Student s1=new Student("abc",20,courses1);
			Student s2=new Student("xyz",21,courses2);
			Student s3=new Student("pqr",22,courses3);
			
			
			List<Student> student=new ArrayList<Student>();
			student.add(s1);
			student.add(s2);
			student.add(s3);
			
			List<Course>courses=new ArrayList<Course>();
			courses.add(c1);
			courses.add(c2);
			courses.add(c3);
			
			r.saveStudent(s2, courses2);

			r.saveStudent(s3, courses3);


			
			
			break;
//		case 2:
//			int id=2;
//			r.findStudent(id);
//			break;
//		case 3:
//			Course c=new Course("webtech",7000);
//			List<Course> c4=new ArrayList<Course>();
//			c4.add(c);
//			r.addCourse(c4,1);
			

		default:
			break;
		}
	}

}
