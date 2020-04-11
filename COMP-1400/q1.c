//Write a C function that takes as input an integer number,
// n, and display the sum of natural numbers from 1 to n-1.
// For example, n= 5, output: 10 (4+3+2+1) 

#include <stdio.h>
//function prototype
int findSum(int);
//main method
int main()
{
    int num; //variable to store num
    //asking user num
    printf("Enter number : ");
    scanf("%d", &num); //reading number
    //call function and print sum
    printf("Sum of numbers from 1 to %d is %d", num, findSum(num));
    return 0;
}
//function to find sum
int findSum(int n)
{
    int sum = 0; //variable used to store sum
    for (int i = 1; i < n; i++)
    {
        //adding each number in the variable sum
        sum = sum + i;
    }
    //return sum
    return sum;
}