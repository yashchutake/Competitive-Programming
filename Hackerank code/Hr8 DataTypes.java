/*1import java.util.*;
import java.io.*;
import java.math.BigInteger;


class Solution{
    public static void main(String []args)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();

                System.out.println(x+" can be fitted in:");
                if(x>=(Byte.MIN_VALUE) && x<=Byte.MAX_VALUE)System.out.println("* byte");
                if(x>=(Short.MIN_VALUE) && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=(Integer.MIN_VALUE) && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=(Long.MIN_VALUE) && x<=Long.MAX_VALUE)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
*/
import java.util.*;
//import java.io.*;
//import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 for(int i=0;i<t;i++){
		 	  
		 	 
		 	  
		 	try{
		 		 long y=sc.nextLong();
		 	  System.out.println(y+" can be fitted in:");
		 		
if(y >= (Byte.MIN_VALUE) && y<=(Byte.MAX_VALUE)){
		 			System.out.println("* byte");
		 		}
		 		
if(y >= (Short.MIN_VALUE) && y<=(Short.MAX_VALUE)){
		 			System.out.println("* short");
		 		}
		 		
if(y >= (Integer.MIN_VALUE) && y<=(Integer.MAX_VALUE)){
		 			System.out.println("* int");
		 		}
		 		
if(y >= (Long.MIN_VALUE) && y<=(Long.MAX_VALUE)){
		 			System.out.println("* long");
		 		}
		 		 		
		}
		 		
 catch(Exception e)
            {
     System.out.println(sc.next()+" can't be fitted anywhere.");
            }
		 		 	
		 }

		 //System.out.println(Byte.MIN_VALUE);
		//System.out.println(Byte.MAX_VALUE);
	}
}