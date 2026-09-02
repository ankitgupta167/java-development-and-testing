package Entity;



import java.awt.image.BandCombineOp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		

EntityManagerFactory emf= Persistence.createEntityManagerFactory("ankit");
EntityManager em=emf.createEntityManager();
EntityTransaction et= em.getTransaction();

Bank b1= new Bank();
b1.setName("sbi");
b1.setIfsc("retd7567");

Account a1= new Account();
a1.setAccountHolderName("raj");
a1.setAc_no(12350);

List<Account> accounts= new ArrayList<>();
accounts.add(a1);

a1.setBank(b1);
b1.setAccounts(accounts);


et.begin();
em.persist(b1);
em.persist(a1);

et.commit();

	}

}
