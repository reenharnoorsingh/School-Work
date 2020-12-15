//Write a program that uses lseek function once to get the size of an open file, and then print
//the size of the file on the screen.

#include <stdio.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <limits.h>
#include <unistd.h>

int main()
{
    int fd = open("file.txt", O_RDONLY);//Read-Only
    printf("The size of the file is %d", lseek(fd, 0, SEEK_END));
}