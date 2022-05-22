
#include <stdio.h>

int main()
{
    int age, marks;
    char a;
    printf("Enter your age\n");
    scanf("%d", &age);
    
    printf("Enter your name\n");
    scanf("%c", &a);
    
   /* printf("Enter your marks\n");
    scanf("%d", &marks);*/

    switch (age)
    {
        case 3:
            printf("The age is 3\n");
          /*  switch (marks)
            {
                case 45:
                    printf("Your marks are 45");
                    break;
            
                default:
                    printf("your marks are not 45");
            }*/
            break;

        case 13:
            printf("The age is 13\n");
            switch (a)
            {
              case 'yash':
              printf("Name is Yash");
              break;
            
              default:
              printf("%c is your name");
            }
            break;

        case 23:
            printf("The age is 23\n");
            break;

        default:
            printf("Age is not 3, 13 or 23\n");
        
    }


    return 0;
}

    