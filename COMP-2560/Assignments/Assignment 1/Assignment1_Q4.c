/*
Write a C program using system call I/O to
a) open an existing text file passed to your program as a command line argument, then
b) display the content of the file,
c) ask the user what information he/she wants to append
d) receive the info from the user via keyboard
e) append the info received in d) to the end of the file
f) display the updated content of the file.
*/
#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#define MAX_LIMIT 1000
int main(int argc, char const *argv[])
{
    FILE *fp;
    char fileName[100];
    printf("Enter the name of the file: ");
    scanf("%s", fileName);
    char append[MAX_LIMIT]; // text that is going to append

    // a) reads  existing file
    char string[9999];
    fp = fopen(fileName, "r");
    if (fp)
    {
        while (fscanf(fp, "%s", string) != EOF)
            // b) displying content
            printf("%s", string);
        fclose(fp);
    }
    else
    {
        printf("\nUnable to open file.\n", fileName);
        exit(EXIT_FAILURE);
    }
    // Open the file in append mode.
    fp = fopen(fileName, "a");
    // c) Input data to append from user
    printf("\n\nEnter data to append: ");
    fflush(stdin); // Goto next line and then append
    // d) recieved data
    fgets(append, MAX_LIMIT, stdin);

    // e) Append data to file
    fputs(append, fp);

    // f0 Display updated content
    printf("\n file appended.Updated file is \n\n");

    //readFile for final print;
    fp = freopen(fileName, "r", fp);
    while (fscanf(fp, "%s", string) != EOF)
        printf("%s", string);

    // closing file
    fclose(fp);

    return 0;
}