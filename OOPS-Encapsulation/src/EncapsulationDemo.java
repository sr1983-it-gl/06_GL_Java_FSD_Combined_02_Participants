
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		HardDrive myWDMovies = new HardDrive();
		myWDMovies.capacityInTB = 100;
		myWDMovies.manufacturerName = "Western Digital";
				
		myWDMovies.displayDetails();
	
		myWDMovies.upgrade();
		
		myWDMovies.displayDetails();
		
		myWDMovies.capacityInTB = -100;
		myWDMovies.displayDetails();
		
	}
}
