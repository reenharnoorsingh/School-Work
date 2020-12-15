/*
Name : Harnoor Singh Reen
Student id: 110006294
*/

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>
int main(int argc, char const *argv[])
{
    int n = argc - 1;
    if (n % 2 != 0)
        n += 1;
    //if no command is provided the display error message
    if (argc <= 1)
        printf("\nInvalid number of arguements\n");
    //if there is only command then we need to execute it
    if (n == 1)
    {
        if (fork() == 0)
        {
            //this line will print the child process id and parent process ids
            printf("[child] pid %d from [parent] pid %d\n", getpid(), getppid());
            execlp(argv[1], argv[1], NULL, (char *)NULL);
            printf("\n");
            exit(0);
        }
        wait(NULL);
    }
    //if there are more commands or commands with options the this block of will be executed
    else
    {
        for (int i = 1; i < n; i++)
        {
            if (fork() == 0)
            {
                //this line will print the child process id and parent process ids
                printf("[child] pid %d from [parent] pid %d\n", getpid(), getppid());
                if (i != n)
                {
                    execlp(argv[i], argv[i], argv[i + 1], (char *)NULL);
                    printf("\n");
                }
                else
                {
                    execlp(argv[i], argv[i], NULL, (char *)NULL);
                    printf("\n");
                }
                exit(0);
            }
            i++;
        }
        for (int i = 0; i < n; i++)
            wait(NULL);
    }
}
