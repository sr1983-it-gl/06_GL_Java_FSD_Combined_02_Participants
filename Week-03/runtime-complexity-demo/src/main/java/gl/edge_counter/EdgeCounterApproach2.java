package gl.edge_counter;

public class EdgeCounterApproach2 {

	public static int count(int noOfNodes) {
		
		int counter = 0;
		
		for (int index = 0; index < noOfNodes; index ++) {
			
			counter = counter + (noOfNodes - (index + 1));
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		
		System.out.println(EdgeCounterApproach2.count(5));
	}
}
