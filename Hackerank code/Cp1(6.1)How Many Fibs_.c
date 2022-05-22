#include<stdio.h>    
void main()    
{    

 long n1=0,n2=1,n3,n;
 long count=0;    
 long a,b;
 //printf("Enter val of a ");    
 scanf("%ld",&a);    
 //printf("Enter val of b ");    
 scanf("%ld",&b);   
 //printf("\n%d %d",n1,n2);
 
 while(1)
  { 
  // if(n1==0){
  //printf("\n%ld",n1);  
  // } 
  //  if(a<i<b){ 
  n3=n1+n2;  
  n1=n2;    
  n2=n3;

  if(a==0 && b==0){
   break;
   }

  if(n3>=a && n3<=b){
   //printf("\n%ld",n3);
   count++;
   }

  if(n3>b){
    break;
   }  
  // }
 }
 //printf("\nres=%ld",count);    
  printf("%ld",count);   
   
 }



//1 one corr
/*#include<stdio.h>    
void main()    
{    

 long n1=0,n2=1,n3,n;
 long count=0;    
 long a,b;

 printf("Enter val of a ");    
 scanf("%ld",&a);    
 printf("Enter val of b ");    
 scanf("%ld",&b);   
 //printf("\n%d %d",n1,n2);   
  
 for(int i=0;i<b;++i)
  { 
  if(n1==0){
   //printf("\n%ld",n1);  
  } 
//  if(a<i<b){ 
  n3=n1+n2;  
  n1=n2;    
  n2=n3;
  if(n3>=a && n3<=b){

  printf("\n%ld",n3);
   count++;
   }

  // }

  }
     printf("\nres=%ld",count);      
 }

 
 
// Try

/*#include<stdio.h>    
int main()    
{    
 int n1=0,n2=1,n3,i,n,count=0;    
 printf("Enter the number of elements:");    
 scanf("%d",&n);    
 printf("\n%d %d",n1,n2);//printing 0 and 1    
 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  printf(" %d",n3);    
  n1=n2;    
  n2=n3;    
  if(n>=10 && n<=100)
  {
    count++;
  }
  
 }  
 printf("\nres %d",count);    
  return 0;  
 }   */ 