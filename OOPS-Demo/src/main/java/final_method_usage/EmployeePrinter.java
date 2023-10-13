package final_method_usage;

import java.io.StringWriter;

import javax.xml.bind.JAXB;

import org.json.JSONObject;

public class EmployeePrinter {

	private Employee employee;
	
	public EmployeePrinter(Employee employee) {
		
		this.employee = employee;		 
	}
	
	public void print() {

		String format = employee.getFormat();
		
		if (format.equals("FORMAT_XML")) {
		
			StringWriter sw = new StringWriter();
			JAXB.marshal(employee, sw);
			System.out.println(sw.toString());
			
		}else if (format.equals("FORMAT_JSON")) {
		
			JSONObject employeeJSONObject 
				= new JSONObject(employee);			
			System.out.println(employeeJSONObject);
		}
		
		
	}
}
