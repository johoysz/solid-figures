import java.util.*;
//
class Sphere{
	private double radius;
	Sphere(double radius){
		this.radius = radius;
	}
	public double computeSurfaceArea() {
		return 4*Math.PI*radius*radius;
	}
	public double computeVolume() {
		return (4.0/3.0)*Math.PI*(radius*radius*radius);
	}
}
// Cuboid has rectangular shaped
class Cuboid{
	private double length;
	private double width;
	private double height;
	Cuboid(double length,double width,double height) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	public double computeVolume() {
		return length * width * height;
	}
	public double surfaceAreaCuboid() {
		return 2 * ( (width * length) + (height * length) + (height * width) );
	}
}
// Cube is square shaped
class Cube{
	private double edgeLength;
	Cube(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	public double computeVolume() {
		return edgeLength*edgeLength*edgeLength;
	}
	public double computeSurfaceArea() {
		return 6*edgeLength*edgeLength;
	}
}

public class Buangjug {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*Sphere sp = new Sphere(48);
		System.out.println("Volume of Sphere: "+sp.computeVolume());
		System.out.println("Surface Area of Sphere: "+sp.computeSurfaceArea()); */
		char ans = ' ';
		int choice=0;
		
		do {
			System.out.println("Append a minimum of 3 Solid figures other than cylinder and cone. ");
			System.out.println("1. Sphere");
			System.out.println("2. Cuboid");
			System.out.println("3. Cube");
			System.out.println("4. Exit");
			System.out.println("Your Choice? ");
			try {
				choice = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Invalid Input. Run the program again.");
				return;
			}
			switch(choice) {
				case 1:
					System.out.println("\n~Welcome to Sphere~");
					System.out.println("Enter radius of Sphere: ");
					try {
						int radius = scan.nextInt();
						Sphere sp = new Sphere(radius);
						System.out.println("Volume of Sphere: "+sp.computeVolume());
						System.out.println("Surface Area of Sphere: "+sp.computeSurfaceArea());
					}catch(Exception e) {
						System.out.println("Invalid Input");
						scan.next(); // emptying the scanner before the next iteration
					}
					break;
				case 2:
					System.out.println("\n~Welcome to Cuboid~");
					try {
						System.out.println("Enter Length: ");
						int length = scan.nextInt();
						System.out.println("Enter Width: ");
						int width = scan.nextInt();
						System.out.println("Enter Height: ");
						int height = scan.nextInt();
						Cuboid cd = new Cuboid(length,width,height);
						System.out.println("Volume of Cuboid: "+cd.computeVolume());
						System.out.println("Surface Area of Cuboid: "+cd.surfaceAreaCuboid());
					}catch(Exception e) {
						System.out.println("Invalid Input");
						scan.next();
					}
					break;
				case 3:
					System.out.println("\n~Welcome to Cube~");
					try {
						System.out.println("Enter edge length of the cube: ");
						int edgeLength = scan.nextInt();
						
						Cube cb = new Cube(edgeLength);
						System.out.println("Volume of Cube: "+cb.computeVolume());
						System.out.println("Surface Area of Cube: "+cb.computeSurfaceArea());
					}catch(Exception e) {
						System.out.println("Invalid Input");
						scan.next();
					}
					break;
				case 4:
					return;
					default:
						System.out.println("Invalid Input. Please try again.");
					
			}
			System.out.println("\nDo you want to continue? yes/no ");
			ans = scan.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
	}

}
