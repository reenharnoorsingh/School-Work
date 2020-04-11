// Write a C function that takes as input an integer number,
// n, and display all the positive factors of n (excluding n itself) and return the sum of them.
// For example: n=12, Output = 1, 2, 3, 4, 6 return 16
#include <stdio.h>

int sumOfFactors(int n)
{
    int i, sum;
    sum = 0;
    printf("\nFactors of %d : ", n);
    for (i = 1; i < n; i++)
    {
        if (n % i == 0) // n divisible by i (Shows the factors)
        {
            printf("%d ", i);// Prints the factors
            sum = sum + i;//Adds the factors
        }
    }
    return sum;
}
int main(void)
{

    int n;
    printf("Enter the number : "); // input of the number
    scanf("%d", &n);
    printf("\nSum of factors of %d = %d", n, sumOfFactors(n));//Function Call
    return 0;
}