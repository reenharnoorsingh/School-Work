/*
Write a C program, called reverse, using standard I/O functions, to take a file as input
then copies it to another file in reverse order. That is, the last byte becomes the first,
the byte just before the last one becomes the second, etc.
*/
#include <stdio.h>
#include <unistd.h>


int main(int argc, char *argv[])
{
    FILE *fp1, *fp2;

    int count;

    if (argc < 3) // checking arguments in the command line
    {
        printf("Error: Invalid Arguments");
        return -1;
    }

    fp1 = fopen(argv[1], "r");
    fp2 = fopen(argv[2], "w");

    if (fp1 == NULL) // check the read file is not correct
    {
        printf("\n%s File can not be opend..\n", argv[1]);
        return -1;
    }

    fseek(fp1, 0, SEEK_END); // set file pointer at end of file
    count = ftell(fp1);      // count the size of file

    int i=0;
    while (i < count) // create while loop until size of file
    {
        i++;                            
        fseek(fp1, -i, SEEK_END);       // set file pointer 0 to end
        fprintf(fp2, "%c", fgetc(fp1)); // write each character by character into file pointer fp2
    }
    // close all files
    close(fp1);
    close(fp2);

    return 0;
}