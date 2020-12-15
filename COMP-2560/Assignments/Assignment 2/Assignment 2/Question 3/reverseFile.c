/*
 Using only standard I/O functions (like fopen(), fseek(), ftell(), fgets(), etc.), write a C
program to reverse the order of the lines in a text file. That is the first line becomes
last, the second line becomes the one before the last one and so on.
 Note: your program should have two arguments, the input file name and the
 output file name.
*/
#include <stdio.h>

int main(int argc, char const *argv[])
{
    FILE *fp1, *fp2;
    long len[100];
    char buf[100];

    fp1 = fopen(argv[1], "r");
    fp2 = fopen(argv[2], "w");

    if (fp1 == NULL)
    {
        printf("File not open!");
        return -1;
    }

    int i = 1, j;
    len[0] = 0;
    //store the starting position of each line
    while (!feof(fp1))
    {
        fgets(buf, 100, fp1);

        if (feof(fp1))
            break;
        len[i] = ftell(fp1);
        i++;
    }

    //write to the text file
    for (j = i - 2; j >= 0; j--)
    {
        fseek(fp1, len[j], 0);
        fgets(buf, 100, fp1);
        fputs(buf, fp2);
    }

    //close the files
    fclose(fp1);
    fclose(fp2);

    return 0;
}
