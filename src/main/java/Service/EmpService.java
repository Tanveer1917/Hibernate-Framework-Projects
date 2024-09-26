package Service;

import java.util.List;

import Model.Employee1;



public interface EmpService {

	
	public Employee1 addEmployee(Employee1 emp);
	public List<Employee1>viewAllEmp();
	public Employee1 getEmpById(long empId);
	public int removeEmployee(long empId);
	public int countEmp();
	public Employee1 getEmployeeWithMaxSalary();
	public List<Employee1>viewAllEmployeeWithASOrder();
	public int updateEmp(Employee1 emp,long empId);
	public Employee1 getLogin(String userName,String password);
	public List<Employee1>getEmpByLocation(String Location);
}
