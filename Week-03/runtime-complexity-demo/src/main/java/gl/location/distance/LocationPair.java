package gl.location.distance;

public class LocationPair {

	private Location one;
	private Location two;
	public Location getOne() {
		return one;
	}
	public void setOne(Location one) {
		this.one = one;
	}
	public Location getTwo() {
		return two;
	}
	public void setTwo(Location two) {
		this.two = two;
	}
	
	public String toString() {
		
		return String.format("Location Pair {%s %s}", one, two);
	}
}
