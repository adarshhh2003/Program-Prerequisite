import java.util.*;
class CalculateSimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate Simple Interest");
		
		System.out.println("Enter the value of Principal");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the value of Rate (in %) :");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the value of Time (in Years) :");
		double time = sc.nextDouble();
		
		System.out.println("The simple interest is : " + ((principal * rate * time) / 100));
	}
}