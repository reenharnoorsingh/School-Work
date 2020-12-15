#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>
#include <sys/wait.h>
void INThandler(int);

int main(int argc, char *argv[])
{
    int i;
    pid_t pid;

    void (*oldHandler1)(); //to save default handlers
    void (*oldHandler2)(); //for CTRL-C and CTRL-Z

    oldHandler1 = signal(2, SIG_IGN);  //ignore CTRL-C
    oldHandler2 = signal(24, SIG_IGN); // ignore CTRL-Z

    pid = fork();

    if (pid < 0)
    {
        perror("fork");
        exit(1);
    }
    if (pid == 0)
    {
        while (1)
        {
             execlp("./donothing", "donothing", NULL);
            sleep(1);
        }
    }
    else if (pid > 0)
    {
        //signal(SIGINT, INThandler);
        for (i = 1; i <= 3; i++)
        {
            printf("I am in parent process.\n");
            //send a signal to child
            kill(pid, SIG_IGN);
            sleep(1);
        }
    }

    for (i = 1; i <= 10; i++)
    {
        printf("I am not sensitive to CTRL-C/CTRL-Z\n");
        sleep(1);
    }
    signal(SIGINT, INThandler);
    for (int i = 0; i <= 10; i++)
    {
        printf("i am sensitive to CTRL-C/CTRL-Z\n");
        sleep(1);
    }
    return 0;
}

void INThandler(int sig)
{

    printf("\n hit Ctrl-C\n");
    exit(0);
}