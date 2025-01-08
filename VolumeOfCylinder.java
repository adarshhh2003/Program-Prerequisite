import java.util.*;
class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Volume Of a Cylinder");
		
		double PiValue = Math.PI;
		
		System.out.println("Enter the value of Radius");
		double radius = sc.nextDouble();
		
		System.out.println("Enter the value of Height");
		double height = sc.nextDouble();
		
		double volume = PiValue * radius * radius * height;
		
		System.out.println("The volume of Cylinder is " + volume);
	}
}