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
	
	Engine e1=new Engine("petrol",1200);
	Car c1= new Car("bmw", 1000, e1);
	
	et.begin();
	em.persist(e1);
	em.persist(c1);
	
	et.commit();
}
}
