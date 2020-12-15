#include <stdio.h>

#define MAX 100

int main()
{
    FILE *f1, *f2;

    long len[MAX];
    char buf[MAX];

    //open the text files
    f1 = fopen("file1.txt", "r");
    f2 = fopen("file2.txt", "w");

    if (f1 == NULL || f1 == NULL)
    {
        printf("File not open!");
        return 1;
    }

    int i = 1, j;
    len[0] = 0;
    //store the starting position of each line
    while (!feof(f1))
    {
        fgets(buf, MAX, f1);

        if (feof(f1))
            break;
        len[i] = ftell(f1);
        i++;
    }

    //write to the text file
    for (j = i - 2; j >= 0; j--)
    {
        fseek(f1, len[j], 0);
        fgets(buf, MAX, f1);
        fputs(buf, f2);
    }

    //close the files
    fclose(f1);
    fclose(f2);

    return 0;
}