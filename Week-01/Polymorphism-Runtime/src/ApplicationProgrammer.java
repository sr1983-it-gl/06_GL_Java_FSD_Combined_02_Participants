
public class ApplicationProgrammer extends Programmer{

	public ApplicationProgrammer() {
		
		super();
	}
	
	String developedApplication;
	
	void setDevelopedApplication(String developedApplication) {
		
		this.developedApplication = developedApplication;
	}
	
	public void display() {

		System.out.println("ApplicationProgrammer.Display");

		super.display();		
		
		System.out.println("Developed Application is " 
				+ developedApplication);
	}
}
