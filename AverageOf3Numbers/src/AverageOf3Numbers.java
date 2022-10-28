import java.util.Scanner;

public class AverageOf3Numbers {

	public static void main(String[] args) {
		float a=0;
		float b=0; 
		float c=0;
		float average=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		a = scan.nextFloat();
		
		System.out.println("Enter the second number:");
		b = scan.nextFloat();
		
		System.out.println("Enter the third number:");
		c = scan.nextFloat();
		
		average = (a+b+c)/3;
		
				
		System.out.println("The average of these numbers is " + average);
		

	}

}
