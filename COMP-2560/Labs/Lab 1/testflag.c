#include <stdio.h>
#include <fcntl.h>
#include <errno.h>
#include <unistd.h>
extern int errno;
int main()
{
    int fd = open("testflag.txt", O_EXCL | O_CREAT, 0777);

    printf("fd = %d \n", fd);

    if (fd == -1)
    {

        printf("Error Number %d \n", errno);

        perror("Program");
    }
    return 0;
}