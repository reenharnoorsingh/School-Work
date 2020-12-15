#include<stdio.h>
#include<signal.h>
#include<stdlib.h>
#include<sys/wait.h>
#include<unistd.h>

void signal_handler(int dummy){

	int status;
	wait(&status);

	printf("Exit status: %d\n", WEXITSTATUS(status));
}

int main(int argc, char* argv[]){

	signal(SIGCHLD, signal_handler);
	int pid= fork(), status;
	if(pid==0){
		sleep(5);
		printf("I am the child\n");
		exit(7);
	}
	else{
		printf("I am the parent\n");
		wait(&status);
	}

}
