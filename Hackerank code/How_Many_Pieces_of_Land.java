import java.util.*;

//Compiler version JDK 11.0.2

class Dcoder
{  
  public static void main(String args[])
  {  
    long n;
    int y;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no cases\n ");
    y=sc.nextInt();
    // n=sc.nextLong();
    while(y>=1){
    //y--;
    //System.out.println("print"+n);
    n=sc.nextLong();
    for(int i=0;i<n;i++){
    System.out.println(n*(n-1)*(n-2)*(n-3)/24 + n*(n-1)/2 + 1);
    break;
    }
    y--;
    }
   // System.out.println("Hello, Dcoder!");
  }
}