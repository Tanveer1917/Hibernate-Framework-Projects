package Controller;

import javax.persistence.EntityManager;

import InheritanceDemo.DesktopProject;
import InheritanceDemo.WebProject;
import Utility.DBUtil; 



public class ProjectApp {
	
	public static void main (String [] args)
	{
		EntityManager em=DBUtil.getEntityManager();
		em.getTransaction();
		
		DesktopProject dp=new DesktopProject(110,"HealthCare","java,angular","pune",100,"jdk","RAM");
		WebProject wp=new WebProject(1345,"Flight Management","python,react","Mumbai",450,"tomcat");
		
		em.persist(wp);
		em.persist(dp);
		em.getTransaction().commit();
	}
}
