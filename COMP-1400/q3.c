//Write a C function that takes as input an integer number,
// n, and converts it to a character array (string) and display it.
 
#include <stdio.h>
#include <stdlib.h>

int main(void)
{

    int n;
    char numstr[1];

    printf("Enter a integer: ");
    scanf("%d", &n);

    sprintf(numstr, "%d", n);

    printf("\n Character Array : %s", numstr);
    return 0;
}