import java.util.Scanner;

public class WeightOfParcel {

	public static void main(String[] args) {
	double pound;
	double kilo;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the weight of the parcel in pound:");
	pound = scan.nextDouble ();
	
	kilo = pound*0.45359237;
	System.out.println("The weight of the parcel in kilogram is " + kilo + "kg");
	

	}

}
