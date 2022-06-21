import java.util.*;

public class Main {
  static int a = 0, b = 0;
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        	int n =sc.nextInt();
        	generate(n);
       
       
    }
    
  static int isPrime(int x)
	{
		// int s = (int)Math.sqrt(x);

        boolean y=true;
        if(x==1 || x==0){
               y=false;
            
        }
        for(int i=2;i<x/2;i++){
          if(x%i==0){
              y=false;
              break;
          }
          
        }
        if(y){
              // System.out.println("Prime");
              return 1;
        }
        else{ 
            return 0;
        }
	}
	
	static void Num(int x)
	{

		// iterates to check prime
		// or not
		for (int i = 2; i <= x / 2; i++) {

			// calls function to check
			// if i and x-i is prime
			// or not
			if (isPrime(i) != 0 && isPrime(x - i) != 0) {

				a = i;
				b = x - i;

				// if two prime numbers
				// are found, then return
		
			}
		}
	}
	
	static void generate(int n)
	{

		if (n <= 7)
			System.out.println("Impossible");

		// if it is not even then 2 and 3
		// are first two of sequence
		if (n % 2 != 0) {// NOt Even
			Num(n - 5);
			System.out.println("2 3 " + a + " " + b);
		}

		else {// Even

			Num(n - 4);

			System.out.println("2 2 " + a + " " + b);
		}
	}

}
