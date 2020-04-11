// Write a C program to read a lowercase character and converts it into the uppercase character.
 
#include <stdio.h>
#include <string.h>

int main()
{
    char s[100];
    int i;
    printf("\n Enter string : ");
    gets(s);

    for (i = 0; s[i] != '\0'; i++) //C uses null-terminated strings, which means that the end of any string is marked by the ASCII value 0 (the null character), which is also represented in C as '\0'.
    {
        if (s[i] >= 'a' && s[i] <= 'z')
        {
            s[i] = s[i] - 32;
        }
    }
    printf("\n String in Upper Case = %s", s);
    return 0;
}