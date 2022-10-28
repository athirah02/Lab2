import java.util.Scanner;

public class SalePrice {

	public static void main(String[] args) {
	
	float original;
	float discount = 30F;
	float SalePrice;
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the original price of an item:");
	original = scan.nextFloat();
	
	System.out.println("The discount applied is " + discount + "%");
	
	SalePrice = original - ((discount)/100)* original ;
	
	System.out.println("The original price of an item is RM"+ original + ".The discount applied is " + discount + "% of the original price.Hence,the sale price of the item is RM" + SalePrice +".");
	

	}

	private static float original() {
		// TODO Auto-generated method stub
		return 0;
	}

}
