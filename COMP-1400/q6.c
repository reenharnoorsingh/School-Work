//Write a program to read input values for an integer array of size 15 and display the second largest integer value in the array
#include <stdio.h>

int main()
{
    int A[15]; //taking array of size 15

    int i, j, a;

    printf("Enter values for arry\n");
    for (i = 0; i < 15; i++) //taking values from user
    {
        scanf("%d", &A[i]);
    }
    for (i = 0; i < 15; ++i) //sorting array in ascending order
    {
        for (j = i + 1; j < 15; ++j)
        {
            if (A[i] > A[j])
            {
                a = A[i];
                A[i] = A[j];
                A[j] = a;
            }
        }
    }
    printf("Second largest number is %d", A[13]); // since a[14] is largest number in the array, a[13] is second largest number.

    return 0;
}