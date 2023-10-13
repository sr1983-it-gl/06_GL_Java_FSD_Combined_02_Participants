package final_method_usage;

public class EmployeeAssignedToProject extends Employee{

	private String projectName;	
	private int mandatoryDailyWorkHours;
	
	public EmployeeAssignedToProject(String firstName, String lastName, int age) {
		
		super(firstName, lastName, age);
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getMandatoryDailyWorkHours() {
		return mandatoryDailyWorkHours;
	}
	
	public void setMandatoryDailyWorkHours(int mandatoryDailyWorkHours) {
		this.mandatoryDailyWorkHours = mandatoryDailyWorkHours;
	}
	
//	public String getFormat() {
//		return "FORMAT_XML";
//	}
	
}
