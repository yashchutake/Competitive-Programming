/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] mat = new int[n][2];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int y=0; y<n; y++)
        {
            for(int c=0; c<2; c++)
            {
             int a=mat[y][c];
             int b=mat[y][c];
        //     }
        // }
   
        System.out.println("----------------");
        for(int i=1; i<n; i++)
        {
            if(mat[i][0]==b){
                System.out.println("i="+i+" 0");
                // i++;
                // continue;
            }
          
            else if(mat[i][1]==b){
                System.out.println("i="+i+" 1");
                // i++;
                // continue;
            }  
            else{
                System.out.println("some beads may be lost");
                break;
            }
                
        }
            }
        }
        
	}
}

