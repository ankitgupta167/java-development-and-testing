package Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ankit");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et= em.getTransaction();
	
	
	Car car= em.find(Car.class, 1);
//	Engine e=car.getEngine();
	
	System.out.println(car);
//	System.out.println(e);
}
	
}
