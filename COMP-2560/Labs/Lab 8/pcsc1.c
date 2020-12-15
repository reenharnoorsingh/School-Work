/*
Name: Harnoor Singh Reen
Student ID: 110006294
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <signal.h>

void action(int dummy)
{
	sleep(1);
	printf("Switching\n");
}

int main(int argc, char *argv[])
{
	pid_t pid;

	if ((pid = fork()) > 0)
	{ //parent
		sleep(1);
		while (1)
		{
			printf("Parent is running\n");
			kill(pid, SIGUSR1);
			signal(SIGUSR1, action);
			pause();
		}
	}
	else //child code
		while (1)
		{ //child
			printf("Child is running\n");
			kill(getppid(), SIGUSR1);
			signal(SIGUSR1, action);
			pause();
		}
}
