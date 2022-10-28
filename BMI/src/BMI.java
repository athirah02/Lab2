import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		float weight=0;
		float height=0;
		float BMI=0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the weight (kg):");
		weight = scan.nextFloat();
		
		System.out.println("Enter the height (m):");
		height = scan.nextFloat();
		
		BMI = weight/(height*height);
		
		System.out.println("The BMI is " + BMI);
		
		
		
		
		

	}

}
