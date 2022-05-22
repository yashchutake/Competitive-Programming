
/*#include <stdio.h>

int main()
{
    int age;
    printf("Enter your age\n");

    scanf("%d", &age);
    printf("You have entered %d as your age\n", age);
    if (age>=18) {
        printf("You can vote!");
    }

    else if(age>=10)
    {
        printf("You are between 10 to 18 and you can vote for kids");
    }
    
    else if(age>=3)
    {
        printf("You are between 3 to 10 and you can vote for babies");
    }

    else{
        printf("You cannot vote!");
    }
    

    return 0;
}
*/
#include <stdio.h>

void main()
{
    while(1){
      
    char sub[20];
    printf("\nEnter name subject You Passed\n");

    scanf("%s",sub);
    printf("You have entered %s as you passed in sub\n", sub);
  
   // if (strcmp(favoriteDairyProduct, "cheese") == 0)

     if(strcmp(sub,"math_and_science")==0) {
        printf("You are passed at sub %s =45",sub);
    }
 
    else if(strcmp(sub,"science")==0) {
        printf("You are passed at sub %s =15",sub);
    }
    
    else if(strcmp(sub,"math")==0){
        printf("You are passed at sub %s =15",sub);
    }

    else{
        printf("Enter Valid sub");
    }
    

  //  return 0;
    }
}

// maths and science - 45
// science - 15
// maths - 15

// print the type of gift you are giving to them