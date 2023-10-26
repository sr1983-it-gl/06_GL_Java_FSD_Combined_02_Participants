package gl.mergesort.recursive;

public class DividePhase {

	private int[] array;
	
	public DividePhase(int array[]) {
		
		this.array = array;
	}
	
	public void divide() {
		
		int begin = 0;
		int end = array.length - 1;
		
		divide("Root", begin, end);
	}
	
	public void divide(String indicator, int begin, int end) {
		
		if (begin < end) {
						
			System.out.println(String.format(
					indicator + " Begin, End [%d %d]", begin, end));			
			
			int middle = (begin + end) / 2;
			

			divide("L", begin, middle);
			divide("R", (middle + 1), end);
			
//			ConquerPhase conquer = new ConquerPhase(array);
//			conquer.conquer(begin, middle, end);
		}
	}
}
