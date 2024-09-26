package InheritanceDemo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="cs_emp")
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
	@Id
	@SequenceGenerator(name = "seq_gen",initialValue = 10000,allocationSize = 1)
	@GeneratedValue( generator = "seq_gen",strategy = GenerationType.SEQUENCE)
	private long empId;
	private String empName;
	private double salary;
	private long phone;
	@OneToOne(cascade = CascadeType.PERSIST)
	private EmpAddress address;
	public Employee( String empName, double salary, long phone, EmpAddress address) {
		super();
		
		this.empName = empName;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
	}
	
	
	
}
