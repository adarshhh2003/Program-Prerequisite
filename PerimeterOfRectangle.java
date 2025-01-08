import java.util.*;
class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Perimeter Of Rectangle");
		
		System.out.println("Enter the value of length :");
		double length = sc.nextDouble();
		
		System.out.println("Enter the value of Width :");
		double width = sc.nextDouble();
		
		System.out.println("The Perimeter Of Rectangle is : " + (2 * (length + width)));
	}
}