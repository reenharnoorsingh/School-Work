//Write a C function that takes as input an integer and return 1 if it is odd and return 0 if it is even. 


#include <stdio.h>
// this function takes integer input and return value depending on evenOdd
int evenOdd(int n)
{
    // checks whether no. is even else odd
    if (n % 2 == 0)
        return 0;
    else
        return 1;
}
// Driver method to check functinality
int main()
{
    // Decalare variable
    int returnValue, n;
    // Promote message for user and get input
    printf("Enter any no.: ");
    scanf("%d", &n);
    // call above function and store value in variable
    returnValue = evenOdd(n);
    // checks for return value by above function and print appropriate message on console
    if (returnValue)
        printf("\nReturn value: %d \n Odd Number\n", returnValue);
    else
        printf("\nReturn value: %d  \n Even Number\n", returnValue);
    return 0;
}
