//package Controller;
//
//import javax.persistence.EntityManager;
//
//import InheritanceDemo.EmpAddress;
//import InheritanceDemo.Manager;
//import InheritanceDemo.Student;
//import InheritanceDemo.Trainer;
//import Utility.DBUtil;
//
//public class TestJoinDemo {
//
//	public static void main(String[] args) {
//		
//		EntityManager em = DBUtil.getEntityManager();
//		em.getTransaction().begin();
//		EmpAddress address = new EmpAddress();
//		address.setCityName("pune");
//		address.setCountryName("India");
//		address.setPinCode(410002);
//		EmpAddress address1 = new EmpAddress();
//		address1.setCityName("Mumbai");
//		address1.setCountryName("India");
//		address1.setPinCode(410001);
//		
//		Trainer t = new Trainer("abc", 50000.00, 98765432, address, "Java FSD", 5);
//		Manager m = new Manager("XYZ", 25000.00, 32145678, address1, "DEF", 1023);
//		Student s = new Student("MNO", 00, 52364885, address1, 152,"HTML");
//		em.persist(s);
//		em.persist(t);
//		em.persist(m );
//		em.getTransaction().commit();
//	}
//
//}
