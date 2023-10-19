
public class HardDrive {

	String manufacturerName;
	int capacityInTB;

	void displayDetails() {
		
		System.out.println("Manufacturer of this software is ->" 
				+ manufacturerName);
		System.out.println("Storage capacity in TB is ->" + capacityInTB);		
	}	
	
	void upgrade() {
		
		capacityInTB = capacityInTB + 100;
	}	
}
