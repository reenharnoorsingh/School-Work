//Write a C function that takes two input parameters, an array of characters (a string),and its size (integer),
// and return 1 if the first character of the given string is uppercase,
// return 0 if it is lowercase,
// and return -1 if it is a digit. 
#include <stdio.h>
#include <string.h>

int firstChar(char s1[], int size); // function prototype

int main()
{
    char str[100];          // variable declaration
    int size, returnResult; // variable declaration
    printf("Enter string : ");
    scanf("%s", str);                                              // Accept the string
    size = strlen(str);                                            // Calling function
    returnResult = firstChar(str, size);                           // calling function pass string and size
    printf("The return value of the fuction: %d\n", returnResult); // print return value
    return 0;
}
int firstChar(char str[], int size) // called function
{
    int result;                         // variable declaration
    if (str[0] >= 'A' && str[0] <= 'Z') // Check first char is Uppercase
        result = 1;
    else if (str[0] >= 'a' && str[0] <= 'z') // Check first char is lowercase
        result = 0;
    else if (str[0] >= '0' && str[0] <= '9') // Check first char is a digit
        result = -1;
    return result; // return the result
}
