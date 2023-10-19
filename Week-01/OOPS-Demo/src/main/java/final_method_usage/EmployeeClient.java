package final_method_usage;

public class EmployeeClient {

	public static void main(String[] args) {
				
		Employee divya = new Employee("Divya", "Prakash", 31);	
		
		divya.getFormat();
		divya.someMethod();
		
		
		EmployeePrinter printer = new EmployeePrinter(divya);		
		printer.print();
		System.out.println();
		
		EmployeeAssignedToProject rajesh 
			= new EmployeeAssignedToProject("Rajesh", "Chauhan", 35);	
		rajesh.setProjectName("ECommerce App");
		rajesh.setMandatoryDailyWorkHours(7);
		
		EmployeePrinter printer2 = new EmployeePrinter(rajesh);		
		printer2.print();
		System.out.println();
		
		
		EmployeeAtOnsite preethi = new EmployeeAtOnsite("Preethi", "Krish", 35);
		preethi.setCountryName("Ireland");
		preethi.setClientName("Accenture");
		preethi.setDuration("10 Months");
		
		EmployeePrinter printer3 = new EmployeePrinter(preethi);		
		printer3.print();
		
	}
}
