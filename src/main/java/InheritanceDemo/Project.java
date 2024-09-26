package InheritanceDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="my_project")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Project {
	
	@Id
	
	private int projectId;
	private String projectName;
	private String skillSet;
	private String location;
	
	
	public Project(int projectId, String projectName, String skillSet, String location) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.skillSet = skillSet;
		this.location = location;
	}
	
	

}
