package Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cyber_Batch")

public class Batch {

	@Id
	@GeneratedValue
	private long batchCode;
	private String batchName;
	private LocalDate batchStartDate;
	private LocalDate batchEndDate;
	private String technology;
	
	
	public long getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(long batchCode) {
		this.batchCode = batchCode;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public LocalDate getBatchStartDate() {
		return batchStartDate;
	}
	public void setBatchStartDate(LocalDate batchStartDate) {
		this.batchStartDate = batchStartDate;
	}
	public LocalDate getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(LocalDate batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public String toString() {
		return "Batch [batchCode=" + batchCode + ", batchName=" + batchName + ", batchStartDate=" + batchStartDate
				+ ", batchEndDate=" + batchEndDate + ", technology=" + technology + "]";
	}
	
	
	
	
}
