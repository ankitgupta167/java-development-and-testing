package View;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

import Entity.Course;
import Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ankit");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
//	Student s1= new Student("raj",45,courses); 
//	Student s2= new Student(2,"aman",26); 
//	Student s3= new Student(3,"jyoti",21);
	
	Course c1=new Course("java",30);
	Course c2=new Course("python",45);
	Course c3=new Course("css",50);
	Course c4=new Course("html",40);
	
//	List<Student> student= new ArrayList<Student>();
	List<Course> courses= new ArrayList<Course>();
	List<Course> courses2= new ArrayList<Course>();
	courses.add(c1);
	courses.add(c4);
//	courses2.add(c1);
	courses2.add(c3);
//	courses2.add(c4);
	Student s1= new Student("raj",41,courses); 
	
	Student s2=new Student("aman",26,courses2);
	Student s3=new Student("aman",26,courses2);
//	s1.add(c1);
//	s1.add(c2);
//	
//	s2.add(c1);
//	s2.add(c4);
//	
//	s3.add(c2);
//	s3.add(c3);
//	s3.add(c4);
	
	et.begin();
	em.persist(c1);
	em.persist(c4);
	em.persist(c3);
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	et.commit();
	
}
}
