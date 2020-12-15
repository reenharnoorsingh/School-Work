/*
Rewrite the provided mycat.c program using read, write, open and close (System
I/O functions) instead of the standard I/O functions. 
*/
#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#define MAX 5000

int main(int argc, char *argv[])
{

    // fp to store value returned by function
    int fp;
    // variable size of file named cat of type ssize_t
    ssize_t cat;
    // array to store words of file
    char word[MAX];

    // check for arguments
    if (argc == 1)
    {

        // take input filename and word to output and store to cat.
        cat = read(STDIN_FILENO, word, sizeof(word) - 1);

        // write  function to output cat to standard output.
        write(STDOUT_FILENO, word, cat);
    }
    else
    {
        while (--argc > 0)
        {
            // for the number of arguments or file name passed
            // open file in read only mode, -1 indicates error
            if ((fp = open(*++argv, O_RDONLY)) == -1)
            {
                // filenot present
                printf("File cannot be opened %s\n", *argv);
                return 1;
            }
            else
            {
                // takes input filename fp and word to output and store to cat.
                cat = read(fp, word, sizeof(word) - 1);
                // write contents of file to output stream.
                write(STDOUT_FILENO, word, cat);
                close(fp);
                // finally close file.
            }
        }
    }
    return 0;
}