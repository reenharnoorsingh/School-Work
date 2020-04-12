// Write a C function that takes two strings (character arrays) as input and return 1 if they are equal and return 0 if they re not.
// Two arrays are considered equal if both arrays contain the same number of elements,
// and all corresponding pairs of elements in the two arrays are equal in the same order.

#include <stdio.h>
#include <string.h>

int compare(char s1[100], char s2[100])
{ //Function definition to compare two strings
    int i;
    if (strlen(s1) != strlen(s2))
    { //If length of the strings are not same then return 0
        return 0;
    }
    for (i = 0; i < strlen(s1); i++)
    { //If length is same them compare character by character
        if (s1[i] != s2[i])
        {
            return 0;
        }
    }
    return 1; //If strings are same
}

int main()
{
    char s1[100], s2[100]; //Declation of character arrays
    printf("Enter first string. ");
    scanf("%s", s1); //First string input
    printf("Enter second string. ");
    scanf("%s", s2); //Second string input

    int result = compare(s1, s2); //Calling the function to compare two strings
    if (result == 1)
    { //If function has returned 1
        printf("Equal strings. ");
    }
    else
    { //If function has returned 0
        printf("Different strings.");
    }

    return 0;
}
