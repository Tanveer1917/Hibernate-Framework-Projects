package InheritanceDemo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CS_Student")
public class Student extends Employee {
	
	private int roll;
	private String course;
	
	public Student(String empName, double salary, long phone, EmpAddress address, int roll, String course) {
		super(empName, salary, phone, address);
		this.roll = roll;
		this.course = course;
	}
	
	

}
