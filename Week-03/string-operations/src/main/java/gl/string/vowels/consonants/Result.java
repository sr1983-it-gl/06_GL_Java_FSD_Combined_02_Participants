package gl.string.vowels.consonants;

public class Result {

	private int noOfVowels;
	private int noOfConsonants;
	
	public Result() {
		
		this.noOfVowels = 0;
		this.noOfConsonants = 0;
	}
	
	public int getNoOfVowels() {
		return noOfVowels;
	}
	
	public void setNoOfVowels(int noOfVowels) {
		this.noOfVowels = noOfVowels;
	}
	
	public int getNoOfConsonants() {
		return noOfConsonants;
	}
	public void setNoOfConsonants(int noOfConsonants) {
		this.noOfConsonants = noOfConsonants;
	}
		
	public String toString() {
		
		return 
			String.format(
				"{Vowels = %d, Consonants = %d}", noOfVowels, noOfConsonants);
	}
}
