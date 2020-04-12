#include <stdio.h>
#include "xstring.h"

int main()
{

    char test[150];
    char c;
    char x;

    printf("Please enter a string of characters: ");
    scanf("%[^\n]s", test);

    printf("Please enter a character to test the function  Find First Occurrence: ");
    scanf(" %c", &c);

    printf("The first occurrence of  %c in %s is at index = %d \n", c, test, FindFirstOccurrence(c, test));

    printf("Please enter a character to test the function  Find Last Occurrence: ");
    scanf(" %c", &c);

    printf("The last occurrence of %c in %s is at index = %d \n", c, test, FindLastOccurrence(c, test));

    printf("The weight of the C String %s is = %d \n", test, GetStringWeight(test));

    ToUpperCase(test);
    printf("The uppercase version is = %s \n", test);

    ToLowerCase(test);
    printf("The lowercase version is = %s \n", test);

    ReverseString(test);
    printf("The reversed version is = %s \n", test);

    printf("Please enter the character you want to replaced when test the function Replace Character: ");
    scanf(" %c", &x);

    printf("Please enter the new  character you want insert when test the function Replace Character: ");
    scanf(" %c", &c);

    ReplaceCharacter(x, c, test);
    printf("The new C String after replacing %c is %s \n", c, test);

    printf("Please enter the  character you want remove when test the function Remove Character: ");
    scanf(" %c", &c);
    RemoveCharacter(c, test);

    printf("%s is the string after removing %c \n", test, c);

    return 0;
}
