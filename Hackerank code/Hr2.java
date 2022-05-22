import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(n);
		if(n%2==0){
			if(2<=n && n<=5){
				System.out.println("Not Weird");
			}
			if(6<=n && n<=20){
				System.out.println("Weird");
			}
			if(n>20){
				System.out.println("Not Weird");
			}
	    }
	    else{
	    	System.out.println("Weird");
	    }
}
}