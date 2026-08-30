
package reposistory;

import entity.Employee;
import exception.EmployeeNotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeReposistory {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ankit");
	private EntityManager em = emf.createEntityManager();
	private EntityTransaction et = em.getTransaction();

	public void addEmloyee(Employee employee) {
		try {
			et.begin();
			em.persist(employee);
			et.commit();
			System.out.println("saved");
		} catch (Exception e) {
			et.rollback();
		}
	}

    public Employee findEmployee(int id) {
    	Employee employee= em.find(Employee.class, id);
    	if(employee !=null) {
    		return employee;
    	}else {
    		throw new  EmployeeNotFoundException("Employee not found");
    	}
    	
    }
    
    public Employee updateEmployee(int id) {
    	Employee employee= findEmployee(id);
    	double exsistingSalary=employee.getSalary();
    	double UpdatedSalary= exsistingSalary+(10.0/100  * exsistingSalary);
    	employee.setSalary(UpdatedSalary);
    	try {
			et.begin();
			em.merge(employee);
			et.commit();
		} catch (Exception e) {
		et.rollback();
		}
    	return employee;
    	
    }
    
    public void deleteEmployee(int id) {
    	Employee employee=findEmployee(id);
    	try {
			et.begin();
			em.remove(employee);
			System.out.println("delete");
			et.commit();
		} catch (Exception e) {
		et.rollback();
		}
    	
    	
    }
}
