/*
Print multiplication table of a number entered by the user in pretty form

Example:

Input
Enter the number you want multiplication table of:
6

Output:
Table of 6:
6 X 1 = 6
6 X 2 = 12
.
.
.
6 X 10 = 60

*/
#include<stdio.h>
int main()
{
    /* code */
    printf("Enter no want to print mul table= ");
    int n;
    scanf("%d",&n);
    for(int c=1;c<=10;c++){
    printf("\n%d X %d=%d",n,c,n*c);
    }
    return 0;
}

