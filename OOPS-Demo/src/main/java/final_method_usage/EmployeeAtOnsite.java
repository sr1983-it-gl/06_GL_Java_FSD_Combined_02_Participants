package final_method_usage;

public class EmployeeAtOnsite extends Employee{

	private String clientName;
	private String countryName;
	private String duration;
	
	public EmployeeAtOnsite(String firstName, String lastName, int age) {
		
		super(firstName, lastName, age);
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
