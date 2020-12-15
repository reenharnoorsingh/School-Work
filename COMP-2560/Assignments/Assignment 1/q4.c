/*
Write a C program using system call I/O to
a) open an existing text file passed to your program as a command line argument, then
b) display the content of the file,
c) ask the user what information he/she wants to append
d) receive the info from the user via keyboard
e) append the info received in d) to the end of the file
f) display the updated content of the file.
*/
#include <unistd.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_LIMIT 1000

    int main(int argc, char *argv[])
{
    int fd1, fd2;
    char c[10000];
    fd1 = open(argv[1], O_RDONLY);//opens existing file
    int size = read(fd1,c,sizeof(c));
    write(STDOUT_FILENO, c, size);//display content
    close(fd1);
    printf("\n");
    //asks for input
    fflush(stdout);
    int b[1000];
    fd2 = open(argv[1], O_RDWR | O_APPEND);
    size_t reader = read(STDIN_FILENO, b, sizeof(b));//receives info from keyboard
    write(fd2, b, reader);
    close(fd2);
    printf("\n");
    //Now print the updated one
    fd1 = open(argv[1], O_RDONLY);
    printf("\nUpdated file: \n");
    size = read(fd2,c,sizeof(c));
    write(STDOUT_FILENO, c, size);
    close(fd1);

    return 0;
}