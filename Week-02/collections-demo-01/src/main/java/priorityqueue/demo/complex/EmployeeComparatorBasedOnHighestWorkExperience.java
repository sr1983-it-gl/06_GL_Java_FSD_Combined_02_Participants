package priorityqueue.demo.complex;

import java.util.Comparator;

public class EmployeeComparatorBasedOnHighestWorkExperience implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
				
		// Descending order Logic
		if (e1.experienceInYears > e2.experienceInYears) {
			return -1;
		}else if (e1.experienceInYears < e2.experienceInYears) {
			return +1;
		}else {			
			return 0;
		}					
	}

	
}
