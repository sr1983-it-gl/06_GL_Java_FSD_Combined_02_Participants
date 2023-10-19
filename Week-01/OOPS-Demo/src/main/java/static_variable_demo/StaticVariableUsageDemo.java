package static_variable_demo;

import static_variable_demo.programs.AddProgram;
import static_variable_demo.programs.AlgorithmProgram;
import static_variable_demo.programs.HWProgram;

public class StaticVariableUsageDemo {

	public static int programsCount = 0;
	public static StringBuilder programDetails = new StringBuilder();
	
	public static void incrementCount() {
		
		programsCount = programsCount + 1;
	}
	
	public static void addProgramDetails(String details) {
		
		programDetails.append(details);
		programDetails.append(System.lineSeparator());
	}
	
	
	public static void main(String[] args) {
				
		runAllPrograms(args);
		printStatistics();
	}
	
	static void runAllPrograms(String[] args){
		
		HWProgram.main(args);
		AddProgram.main(args);
		AlgorithmProgram.main(args);
		AddProgram.main(args);
		HWProgram.main(args);
		
	}
	 
	static void printStatistics() {
		
		System.out.println("---------------------------------------------");
		System.out.println("No of programs executed -> " + programsCount);
		
		System.out.println("Details about the programs...");
		System.out.println(programDetails.toString());
		System.out.println("---------------------------------------------");		
	}
}
