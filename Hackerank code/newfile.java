import java.util.*;

public class Main
{
     public static int reverse(int number)
       {
      //  public int num=number;
           int rev = 0;  
           while(number != 0)   
         {  
            int remainder = number % 10;  
            rev = rev * 10 + remainder;  
            number = number/10;  
          }  
            return rev;        
        }
       
	public static void main(String[] args) 
	{
	    int n, z;
	   // System.out.println("The reverse of the given number is: " +reverse(123));
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter no");
	   n=sc.nextInt();	    
      
       int rev_no=reverse(n);     
         
		if(rev_no==n){
		  System.out.println("the input is palindrome.........");
		}	
		
	    else
	   {	        
	   //  z=x+n;
	     int count;
	     while(rev_no != n)
	     {
	     	count++;
	     	n=n+rev_no;
	     	rev_no=reverse(n);
	     }
	     System.out.println(count+" "+n);    
	 
	     }
	     
	     
	     
	     
	     
	     
	     
	     /*
         int r,sum=0,temp;
                 
         temp=n;    
         while(n>0)
         {    
             r=n%10;  //getting remainder  
             sum=(sum*10)+r;    
             n=n/10;    
             
         }
         
         if(temp==sum) {
         System.out.println("palindrome number ");   
         } 
        else    {
        System.out.println("not palindrome");    
        }  
	    
	    */
	   
	    
	    
	    
	     
	      
	       
	         
	    
	    }		
		
	//	System.out.println("Hello World");
	}
}

