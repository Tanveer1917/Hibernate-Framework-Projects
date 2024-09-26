package InheritanceDemo;

import javax.persistence.Entity;

@Entity

public class WebProject extends Project{
	
	private int teamSize;
	private String webServiceName;
	
	public WebProject(int projectId, String projectName, String skillSet, String location, int teamSize,
			String webServiceName) {
		super(projectId, projectName, skillSet, location);
		this.teamSize = teamSize;
		this.webServiceName = webServiceName;
	}
	
	
	
	
	

}
