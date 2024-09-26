package Dao;

import java.util.List;

import javax.persistence.EntityManager;

import Model.Employee1;
import Service.EmpService;
import Utility.DBUtil;

public class EmployeeDAO implements EmpService {

	@Override
	public Employee1 addEmployee(Employee1 emp) {
		
		//adding 
		EntityManager em=DBUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		return emp;
	}

	@Override
	public List<Employee1> viewAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee1 getEmpById(long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeEmployee(long empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countEmp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee1 getEmployeeWithMaxSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee1> viewAllEmployeeWithASOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmp(Employee1 emp, long empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee1 getLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee1> getEmpByLocation(String Location) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
