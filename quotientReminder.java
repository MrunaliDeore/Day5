package Five;

import java.util.Scanner;

public class quotientReminder 
{
	public static void main(String[] args)
	{
		int num1, num2, quotient = 0, rem = 0;  
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		num1 =scan.nextInt();
		num2=scan.nextInt();
		
		quotient = num1 / num2;  
	    rem = num1 % num2;  
	    
	    System.out.println("Quotient when : "+num1 +"/"+ num2+ "\tis="+ quotient );
	    System.out.println("Reminder when : "+num1+" is divided by "+ num2+" is= "+rem);
		
		
	}
}
