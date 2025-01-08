import java.util.*;
class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of a circle");
		
		System.out.println("Enter the radius of circle");
		double radius = sc.nextDouble();
		
		double PiValue = Math.PI;
		double area = PiValue * radius * radius;
		
		System.out.println("Area of Circle is " + area);
	}
}
		