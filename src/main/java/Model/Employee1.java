package Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Cyber_EMP")
public class Employee1 {

	@Id
	@SequenceGenerator(name="seq_gen",initialValue= 1000,allocationSize=1)
	@GeneratedValue(generator="seq_gen",strategy=GenerationType.SEQUENCE)
	@Column(name="emp_id")
	private long empId;
	@Column(name="emp_name")
	private String empName;
	@Column(name="emp_phone",unique=true)
	private long empPhone;
	@Column(name="user_name",unique=true)
	
	private String userName;
	@Column(name="user_password",unique=true)
	private String password;
	@Column(name="emp_salary")
	private double empSalary;
	@Column(name="emp_dob")
	private LocalDate empDOB;
	@Column(name="emp_project")
	private String empProject;
	@Column(name="emp_address")
	private String address;
	@Column(name="mail_id")
	private String emailID;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}
	public String getEmpProject() {
		return empProject;
	}
	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	

	}
