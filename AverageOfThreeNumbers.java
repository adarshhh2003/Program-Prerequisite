import java.util.*;
class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Average of Three Numbers");
		
		System.out.println("Enter the value of First Number :");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of Second Number :");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of Third Number :");
		double c = sc.nextDouble();
		
		System.out.println("Average of Three Numbers is :" + ((a + b + c)/3));
	}
}