import java.util.*;
class KilometersToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Convert Kilometers to Miles");
		
		System.out.println("Enter the value Kilometers :");
		double kilometers = sc.nextDouble();
		 
		System.out.println("The value of converting kilometers to miles is :" + (kilometers * 0.621371));
	}
}