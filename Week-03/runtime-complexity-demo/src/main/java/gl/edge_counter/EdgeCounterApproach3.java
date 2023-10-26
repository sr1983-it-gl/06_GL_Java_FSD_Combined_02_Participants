package gl.edge_counter;

public class EdgeCounterApproach3 {

	public static int count(int noOfNodes) {
		
		int counter = 0;
		
		counter = (noOfNodes * (noOfNodes - 1) / 2);
				
		return counter;
	}
	
	public static void main(String[] args) {
		
		System.out.println(EdgeCounterApproach3.count(5));
	}
}
