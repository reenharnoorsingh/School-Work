// Write a C program that reads ten integer numbers from the user and stores them in an array of size 10.
// Then count and display the sum of the odd numbers which are in the even index positions of the array.

#include<stdio.h>

int main()
{
    int a[10], count = 0, sum = 0, i;
    for (i=0;i<10;i++)
    {
        printf("Enter a number: ");
        scanf("%d", &a[i]);
    
    if (i%2 == 0)
    {
        if(a[i]%2 != 0)
        {
            sum = sum + a[i];
            count = count + 1;
        }
    }
    }
    printf("The Sum of ODD numbers in the even index: %d \n", sum);
    printf("Number of ODD numbers in the even index: %d\n", count);
}