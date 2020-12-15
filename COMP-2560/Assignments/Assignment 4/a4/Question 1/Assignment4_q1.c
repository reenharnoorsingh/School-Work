/*
Name : Harnoor Singh Reen
Student id: 110006294
*/
#include <stdio.h>
#include <fcntl.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>

//Writing "Hello World!" into the same file using two processes
int main(int argc, char *argv[])
{

	int fd;
	fd = open("hello.txt", O_CREAT | O_WRONLY, 0666); //Creating file descriptor

	//Forking
	if (fork() == 0)
	{
		printf("Child process is writing\n");
		//Writing into the file from the child
		write(fd, "Hello", 5);
		close(fd); //Closing the file descriptor
		exit(0);   //Exiting
	}
	else
	{
		printf("Parent process is waiting\n");
		int status;
		//Waiting for child to finish writing
		wait(&status);
		printf("Parent is writing\n");
		//Writing into the file from the parent
		write(fd, " World!\n", 7);
		//This write() still works in spite of closing the file, this shows that
		// the file descriptor is not shared by the parent and child processes.
		//But they are copied, so they write in the same file, but the descriptors are
		//different.
	}
}
