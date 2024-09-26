package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Cyber_Trainer")
public class Trainer {
	
	@Id
	@GeneratedValue
	@Column(name="trainer_id")
	private int trainerId;
	
	@Column(name="trainer_name")
	private String name;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="trainer_address")
	
	private TrainerAddress address;
	@Column(name="trainer_skills")
	
	private String skillSet;
	@Column(name="trainer_email",unique=true, nullable = false)
	
	private String mailId;
	@Column(name="trainer_phone",unique=true, nullable = false)
	private long phone;
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="trainer_")
	
	private List<Batch> batches=new ArrayList();
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainerAddress getAddress() {
		return address;
	}
	public void setAddress(TrainerAddress address) {
		this.address = address;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Batch> getBatches() {
		return batches;
	}
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}
	
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", name=" + name + ", address=" + address + ", skillSet=" + skillSet
				+ ", mailId=" + mailId + ", phone=" + phone + ", batches=" + batches + "]";
	}
	
	
	

}
