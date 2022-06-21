//updated sol

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A");
        int A=sc.nextInt();
        System.out.println("B");
        int B=sc.nextInt();
        int X,Y;
        int i,D=1;
      
      
       //gcd of A and B
      
       for( i = 1; i <= A && i <= B; ++i)  
        {  
           if (A % i ==0 && B % i == 0) { 
            D = i;
             }
         } 
        
      // find the value X and Y Basis on value of D (GCD)
      for(X=A;X>=-1;--X){
          for(Y=B;Y>=0;--Y){
            // if(A==B){
            //      if(A*X+B*Y==D && X>0){
            //       System.out.println(X+" " +Y);
            //       break;
            //      }
            //  }
          //  else{
             if(A*X+B*Y==D){
                  System.out.println(X+" " +Y);
                  break;
                 }
           // }
             
        }
      }
        //System.out.println("Hello World!");
       System.out.println("GCD : " + D);
    }
}





//2 nd one

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A");
        int A=sc.nextInt();
        System.out.println("B");
        int B=sc.nextInt();
        int X,Y;
        int i,D=1;
        
       for( i = 1; i <= A && i <= B; ++i)  
        {  
        if (A % i ==0 && B % i == 0) { 
            D = i;
        }
         } 
         
      for(X=A;X>=-1;--X){
          for(Y=B;Y>=0;--Y){
            if(A==B){
                 if(A*X+B*Y==D && X>0){
                  System.out.println(X+" " +Y);
                  break;
             }
            }
            else{
             if(A*X+B*Y==D){
                  System.out.println(X+" " +Y);
                  break;
             }
            }
             
      }
      }
        //System.out.println("Hello World!");
       System.out.println("now: " + D);
    }
}
