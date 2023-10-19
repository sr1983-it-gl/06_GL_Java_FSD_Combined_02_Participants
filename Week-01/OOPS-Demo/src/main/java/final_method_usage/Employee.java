package final_method_usage;

public class Employee {

	private String firstName;
	private String lastName;
	private int age;
	private Printer printer;
	
	public Employee(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public final String getFormat() {
		return "FORMAT_JSON";
	}
	
	private void someMethod() {
		
	}
}
