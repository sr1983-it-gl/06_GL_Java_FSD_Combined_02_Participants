package gl;

public class MinElementFinderInArray {

	public static int findMin(int[] items) {
		
	    int smallest = Integer.MAX_VALUE;
	    
	    for (int index = 0; index < items.length; index ++) {
	    	
	    	int element = items[index];
	    	if (element < smallest) {
	    		smallest = element;
	    	}
	    }
	    
	    return smallest;
	
	}
	
	public static void main(String[] args) {
		
		int [] items = {10, 24, 3, 67, 21, 9, 34};
		int element = MinElementFinderInArray.findMin(items);
		System.out.println(element);
			
	}
}
