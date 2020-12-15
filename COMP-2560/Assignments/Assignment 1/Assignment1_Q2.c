/**
Write a C program called writer.c. It uses system call I/O to create a file called “list1.txt”
which has the following text-based content
**/

#include <stdio.h>
#include <fcntl.h>
int main(int argc, char const *argv[])
{
    int fd = open("list1.txt", O_WRONLY | O_CREAT | O_TRUNC,0644);
    //conditon check
    if (fd<0)
    {
        exit(1);
    }
    write(fd,"101   GM\tBuick\t2010\n102   Ford\tLincoln\t2005\n",strlen("101   GM\tBuick\t2010\n102   Ford\tLincoln\t2005\n"));
    close(fd);
    return 0;
}
