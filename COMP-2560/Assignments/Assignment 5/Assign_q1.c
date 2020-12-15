/*
Name: Harnoor Singh Reen
Student ID: 110006294
*/
#include <stdio.h>
#include <signal.h>
#include <unistd.h>
#include <stdlib.h>

// Function prints messages
void sigalrm()
{
    printf("Ding!\n");
    printf("done\n");
    exit(0);
}

int main(int argc, char *argv[])
{
    // Check if sleep time is passed as argument or not.
    if (argc != 2)
    {
        printf("Arguement for seconds missing\n");
        exit(1);
    }

    int sleepTime = atoi(argv[1]); //converts string arguement to an integer type

    printf("alarm application starting\n");

    // Forking a new process. For returns 0 when it is a child process and it
    // return child process id incase of parent.
    if (fork() == 0)
    {
        printf("waiting for alarm to go off\n");
        printf("<%d second pause>\n", sleepTime);
        // Sleeping for requested time
        sleep(sleepTime);
        kill(getppid(), SIGALRM); //sends signal to parent process
    }
    else
    {
        //parent process
        signal(SIGALRM, sigalrm);
        // Do an infinite wait here to wait for the signal
        while (1)
        {
        }
    }
}
