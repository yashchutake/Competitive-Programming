
import java.util.*;
public class AdjMatrixGraph
{
    int vertices;
    int matrix[][];
    AdjMatrixGraph(int vertices){
        this.vertices=vertices;
        matrix=new int[vertices][vertices];
    }
    void addEdge(int source,int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    
    void printGraph(){
        for(int i=0;i<vertices;i++){
             for(int j=0;j<vertices;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
// 	public static void main(String[] args) {
// 		System.out.println("Hello World");
// 	}

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No Of Vertices");
        int v=sc.nextInt();
        AdjMatrixGraph amg=new AdjMatrixGraph(v);
        System.out.println("Enter No Of Edge");
        int e=sc.nextInt();
        System.out.println("Enter start and End vertex");
        for(int i=0;i<v;i++){
          // System.out.println("Enter source vertex");
           int a=sc.nextInt();
          // System.out.println("Enter destination vertex");
           int b=sc.nextInt();
           
           amg.addEdge(a,b);
        }
        System.out.println("The Adjacency Matrix -");
        amg.printGraph();
    }

}
