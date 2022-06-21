import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no for n");
        int n=sc.nextInt();
        System.out.println("Enter a no for m");
        int m=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
          fact=fact*i;
        }
        if(fact%m==0){
           System.out.println(m+" divides "+n +"!");
        }
        else{
              System.out.println(m+" does not divides "+n+"!");
        }
        System.out.println("now: " +fact);
    }
}
