import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt();
        boolean y=true;
        if(n==1 || n==0){
               y=false;
            
        }
        for(int i=2;i<n/2;i++){
          if(n%i==0){
              y=false;
              break;
          }
          
        }
        if(y){
              System.out.println("Prime");
        }
        else{ 
          System.out.println("Not Prime");
          
        }
    
    
    }
}