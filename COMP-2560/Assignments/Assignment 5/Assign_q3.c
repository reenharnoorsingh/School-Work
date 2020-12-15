/*
Name: Harnoor Singh Reen
Student ID: 110006294
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(int argc, char const *argv[])
{
    int fd[2]; // to store pipe file ends
    pipe(fd);
    int pid = fork(); // forking to create child and parent process

    // if process is child
    if (pid == 0)
    {
        close(fd[0]); // closing unusable pipe end
        FILE *fp;
        fp = popen(argv[1], "r"); // running command

        if (fp == NULL)
        {
            printf("Failed to run command\n");
            exit(1);
        }
        char msg[10005]; // array to hold command result

        // while there is command result writing to pipe
        while (fgets(msg, sizeof(msg), fp) != NULL)
        {
            write(fd[1], msg, strlen(msg) + 1); // writing to pipe
            sleep(0.1);                         // sleep child process until ast line is read from pipr by parent process and write to result.txt
        }

        pclose(fp);   // closing command output
        close(fd[1]); // closing pipe another end
    }
    else
    {
        close(fd[1]);    // closing unusable pipe end in parent
        char res[10005]; // array to store data reading from pipe
        int bytesread, totalbytes = 0;
        ;

        // opening file result.y=txt
        FILE *fptr = fopen("result.txt", "w");
        if (fptr == NULL)
        {
            printf("Failed to open result.txt\n");
            exit(1);
        }

        // while there is data in pipe
        while ((bytesread = read(fd[0], res, 10000)) > 0)
        {
            totalbytes += bytesread;
            fprintf(fptr, "%s", res); // writing to file result.txt
        }
        printf("The result of %s is written into result.txt with total %d bytes.\n", argv[1], totalbytes);
        fclose(fptr); // closing result.txt
        close(fd[0]); // closing pipe other end
    }
    return 0;
}
