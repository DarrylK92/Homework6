/**
 * Homework6 - 9.1 Sphere: Creates two instances of the sphere class
 * 
 * CIS2571-001
 * @author Darryl Karney
 * @version 02Jun2018
 */

public class Homework6 {

	public static void main(String[] args) {
		//Create sphereOne
		Sphere sphereOne = new Sphere(12);
		runMethods(sphereOne, "first");
		
		//Create sphereTwo
		Sphere sphereTwo = new Sphere(-15);
		runMethods(sphereTwo, "second");
	}
	
	/** Displays output to the user with data from the created spheres
	 * 
	 * @param sphere	The sphere instance to use
	 * @param text		The text to display in strings. Should be something like "first", "second", "third", etc...
	 */
	public static void runMethods(Sphere sphere, String text) {
		//Display radius
		System.out.println("The " + text + " sphere's radius is " + sphere.radius);
		
		//Display surface area
		if (!sphere.checkRadius()) {
			System.out.println("The radius for the " + text + " sphere is invalid");
		} else {
			System.out.println("The " + text + " sphere's surface area is " + sphere.getSurfaceArea());
		}
		
		//Display result of checkRadius
		System.out.println("The " + text + " sphere's result of checkRadius() is " + sphere.checkRadius());
	}

}

class Sphere {
	//The radius of the sphere
	double radius = 0;
	
	/** No-arg constructor
	 *
	 */
	Sphere() {
		
	}
	
	/** Constructor with radius argument
	 * 
	 * @param newRadius		Sets the radius of the sphere
	 */
	Sphere(double newRadius) {
		radius = newRadius;
	}
	
	/** Returns the surface area of the sphere if the radius of the sphere is valid
	 * 
	 * @return		Returns the surface area of the sphere if the sphere's radius is valid. Otherwise it returns 0.
	 */
	double getSurfaceArea() {
		if (!checkRadius()) {
			return 0;
		}
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	/** Checks if the radius of the sphere is valid
	 * 
	 * @return		Returns whether or not the radius of the sphere is valid
	 */
	boolean checkRadius() {
		if (radius > 0) {
			return true;
		} else {
			return false;
		}
	}
}