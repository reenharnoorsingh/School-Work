/*
Name : Harnoor Singh Reen
Student id : 110006294
*/
#include <stdio.h>
#include <string.h>
#include <signal.h>
#include <unistd.h>

int main()
{

    //First we create a child process using fork()
    pid_t pid;
    pid = fork();
    int i, a = 1;

    //Using if and else we differentiate child and parent process
    if (pid == 0)
    {
        //We create an infite loop in child process with help of for loop
        for (i = 0; i <= a; i++)
        {
            printf("Line number:%d\n", a);
            a++;
            sleep(3);
        }
    }
    else
    {

        //We do make it sleep and do the following as said in c),d),e)
        sleep(8);
        kill(pid, SIGSTOP);
        sleep(5);
        kill(pid, SIGCONT);
        sleep(8);
        kill(pid, SIGINT);
    }

    return 0;
}
/*
In this program we observe:
The SIGSTOP signals are used to stop a process from executing.
The SIGCONT signals are used to continue the process's execution after being stopped, 
i.e with using SIGSTOP then we can use SIGCONT to continue.
The SIGINT signals are used to start an interruption which basically kills that process.
*/