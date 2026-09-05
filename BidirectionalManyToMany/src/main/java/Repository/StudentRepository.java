//package Repository;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class StudentRepository {
//
//	EntityManagerFactory emf= Persistence.createEntityManagerFactory("ankit");
//	EntityManager em= emf.createEntityManager();
//	EntityTransaction et= em.getTransaction();
//	
//	public void saveStudent(Student student, List<Course> course) {
//		
//		
//		
////		read the student, print the course which student are taken, cratate mutiple method like add mutiple student, do practice on chatgpt , get more extra clearity 
//		// always think more and more do paractive.
//		
//	}
//}
package Repository;

import java.util.List;

import entity.Course;
import entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentRepository {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("ankit");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void saveStudent(Student student,List<Course> courses) {
		et.begin();
		for(Course course:courses) {
			em.persist(course);
		}
		em.persist(student);
		et.commit();
	}
	
	
	public void findStudent(int id) {
		Student student=em.find(Student.class, id);
		
	List<Course> course=	student.getCourses();
	System.out.println("Student details");
	System.out.println(student);
	System.out.println("course details");
	for(Course c:course) {
		System.out.println(c);
	}

	}
	public void addCourse(List<Course> course ,int id) {
		Student student =em.find(Student.class, id);
		
		
		
	}
	
	//update
	
	//delete

	
}
