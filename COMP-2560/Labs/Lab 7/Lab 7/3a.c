/*
Name: Harnoor Singh Reen
Student id: 110006294
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>
void INThandler(int);

int main(int argc, char *argv[])
{
    int i;
    void (*oldHandler1)(); //to save default handlers
    void (*oldHandler2)(); //for CTRL-C and CTRL-Z

    oldHandler1 = signal(SIGINT, SIG_IGN);  //ignore Terminal interrupt signal
    oldHandler2 = signal(SIGTSTP, SIG_IGN); // ignore Terminal stop signal
    for (i = 1; i <= 10; i++)
    {
        printf("I am not sensitive to CTRL-C/CTRL-Z\n");
        sleep(1);
    }
    signal(SIGINT, INThandler);
    for (int i = 0; i <= 10; i++)
    {
        printf("i am sensitive to CTRL-C\n");
        sleep(1);
    }
    return 0;
}

void INThandler(int sig)
{

    printf("\nCTRL-C pressed\n");
    exit(0);
}