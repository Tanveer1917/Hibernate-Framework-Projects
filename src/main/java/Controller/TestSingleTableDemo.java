package Controller;

import javax.persistence.EntityManager;

import InheritanceDemo.Admin;
import InheritanceDemo.Customer;
import Utility.DBUtil;

public class TestSingleTableDemo {

	public static void main(String[] args) {
		
		EntityManager em = DBUtil.getEntityManager();
		em.getTransaction().begin();
		
		Admin admin = new Admin(108, "admin", "admin@123");
		
		Customer customer = new Customer(101, "customer", "customer@123");
		
		em.persist(customer);
		em.persist(admin);
		
		em.getTransaction().commit();
	}

}
