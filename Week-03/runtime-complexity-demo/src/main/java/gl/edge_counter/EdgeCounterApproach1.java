package gl.edge_counter;

public class EdgeCounterApproach1 {

	public static int count(int noOfNodes) {
		
		int counter = 0;
		
		for (int iIndex = 0; iIndex < noOfNodes; iIndex ++) {
			
			for (int jIndex = (iIndex + 1); jIndex < noOfNodes; jIndex ++ ) {
				
				counter ++;
			}
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		
		System.out.println(EdgeCounterApproach1.count(5));
	}
}
