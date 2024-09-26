package InheritanceDemo;

import javax.persistence.Entity;

@Entity

public class DesktopProject extends Project{
	
	private int teamSize;
	private String softwareRequirement;
	private String hwRequirement;
	
	public DesktopProject(int projectId, String projectName, String skillSet, String location, int teamSize,
			String softwareRequirement, String hwRequirement) {
		super(projectId, projectName, skillSet, location);
		this.teamSize = teamSize;
		this.softwareRequirement = softwareRequirement;
		this.hwRequirement = hwRequirement;
	}
	
	
		

}
