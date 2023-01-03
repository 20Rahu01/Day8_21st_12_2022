package Problems;

public class IdentifiesAlphabets {

	public static void main(String []args)
    {
       char ch='s';    
          
       if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
    	   
            System.out.print(ch + " is an alphabet ");
       }
       else
       {
            System.out.print(ch + " is not an alphabet ");
       }
    } 
}
