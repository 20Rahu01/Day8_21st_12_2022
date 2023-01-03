package Problems;
import java.util.Scanner;
public class GreatestAmongThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of A:");
	    int a=sc.nextInt();
	    System.out.println("Enter Value of B:");
	    int b=sc.nextInt();
	    System.out.println("Enter Value of C:");
	    int c=sc.nextInt();
		//external if
		if(a>b) {  // 20>50f
			//internal if
			if(a>c)
				System.out.println(a+" is grater");
			else
				System.out.println(c+" is grater");
		}
		else {
			if(b>c)
				System.out.println(b+" is grater");
			else
				System.out.println(c+" is grater");
		}
        
	}
}

	
	

