package Controller;

import java.time.LocalDate;
import java.util.Scanner;

import Dao.EmployeeDAO;
import Model.Employee1;
import Service.EmpService;

public class EmpApp {

	public static void main(String[] args) {
		
		EmpService service=new EmployeeDAO();
		//create object of Scanner
		Scanner sc=new Scanner(System.in);
        System.out.println("How many Employee do you want ot save");
        int noe=sc.nextInt();
        for(int i=0;i<noe;i++)

	{
        	System.out.println("Enter the Employee name");
            String name=sc.next();
            System.out.println("Enter the Employee salary");
            double salary=sc.nextDouble();
            System.out.println("Enter the phone number");
            long ph=sc.nextLong();
            System.out.println("Enter the mail id");
            String email=sc.next();
            System.out.println("Entr the address");
            String address=sc.next();
            System.out.println("Enter the username ");
            String un=sc.next();
            System.out.println("Enter the password");
            String pw=sc.next();
            System.out.println("Enter employee project ");
            String projectName=sc.next();
            System.out.println("Enter the employee DOB in yyyy-MM-dd");
            String dob=sc.next();
            LocalDate Id=LocalDate.parse(dob);
            
            //we can set all the valuess with employee object
            Employee1 empObj=new Employee1();
            empObj.setAddress(address);
            empObj.setEmailID(email);
            empObj.setEmpDOB(Id);
            empObj.setEmpName(name);
            empObj.setEmpPhone(ph);
            empObj.setEmpProject(projectName);
            empObj.setEmpSalary(salary);
            empObj.setPassword(pw);
            empObj.setUserName(name);
            
            //calling addEmployee() method of Service class
            
            service.addEmployee(empObj);
            
	}
	}

}
