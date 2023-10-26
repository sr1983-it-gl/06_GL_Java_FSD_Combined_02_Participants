package gl.location.distance;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class MinDistanceCalculator {

	private static LocationPair locationPair 
		= new LocationPair();
	
	public static LocationPair findMinDistance(List<Location> locations) {
						
		for (int index = 0; index < locations.size(); index ++) {
			
			Location locationObj1 = locations.get(index);
			locationPair = findMatch(index, locationObj1, locations);
		}
		
		return locationPair;
	}
	
	static LocationPair findMatch(
			int outerIndex, Location locationObj, List<Location> locations) {
		
		double minDistance = Double.MAX_VALUE;
		
		for (int innerIndex = (outerIndex + 1); innerIndex < locations.size(); innerIndex ++) {
			
			Location locationObj2 = locations.get(innerIndex);
			
			double tempDistance = calculateDistance(locationObj, locationObj2);
			
			if (tempDistance < minDistance) {
				minDistance = tempDistance;
				
				locationPair.setOne(locationObj);
				locationPair.setTwo(locationObj2);				
			}
		}
		return locationPair;
	}
	
	static double calculateDistance(Location l1, Location l2) {
		
		return Point2D.distance(l1.getX(), l1.getY(), l2.getX(), l2.getY());
		
	}
	
	public static void main(String[] args) {
		
		List<Location> locations = new ArrayList<Location>();
		
		locations.add(new Location(10, 10));
		locations.add(new Location(100, 10));
		locations.add(new Location(10, 120));
		locations.add(new Location(65, 35));
		locations.add(new Location(70, 35));
		
		LocationPair locationPair 
			= MinDistanceCalculator.findMinDistance(locations);
		System.out.println(locationPair);
	}
}
