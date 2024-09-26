package InheritanceDemo;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee{
	private String magName;
	private long magId;
	public Manager( String empName, double salary, long phone, EmpAddress address, String magName,
			long magId) {
		super( empName, salary, phone, address);
		this.magName = magName;
		this.magId = magId;
	}
	
	
}
