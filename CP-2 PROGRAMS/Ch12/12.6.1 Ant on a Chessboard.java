/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
// 	    System.out.println("Enter rows and col");
// 	    Scanner sc=new Scanner(System.in);
// 		//Scanner sc=new Scanner(System.in);
// 		int row=sc.nextInt();
// 		int col=sc.nextInt();
	    
	   // int arr[][] =new int[5][5];
	    int i, j, m, n,x=0,y=0;
	    int[][] chess = { {25, 24, 23, 22, 21},
        {10, 11, 12, 13, 20},
        {9, 8, 7, 14, 19},
        {2, 3, 6, 15, 18},
        {1, 4, 5, 16, 17}};
        
        Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    
	      for(i = 0; i< 5; i++) {
        for(j = 0; j< 5; j++) {
            if(chess[i][j]== n){
                x = j + 1;
                y = 5- i;
                break;
            }
        }
    }
    
    System.out.println(x+" "+y);
    
// 	   System.out.println("Enter matrix element");
// 	    int arr[][] =new int[row][col];
// 		for(int i=0;i<arr.length;i++){
// 		    	for(int j=0;i<col;j++){
// 		        arr[i][j]=sc.nextInt();
// 	     	}
// 		}
		
// 		for(int i=0;i<arr.length;i++){
// 		    	for(int j=0;i<col;j++){
// 		      System.out.print(arr[i][j]);
// 		       System.out.println();
// 	     	}
// 		}
		
		
		
		
	//	System.out.println("Hello World");
		
		
		
	}
}
