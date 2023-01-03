package Problems;
import java.util.Scanner;


public class PositiveNegative {

	
		public static void main(String[] args) {

			int a;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
		    a=sc.nextInt();
		    if(a>=0)
		    	System.out.println(a+" is positive");
		    else
		    	System.out.println(a+" is negative");

		}
	}
