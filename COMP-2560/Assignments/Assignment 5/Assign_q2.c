/*
Name: Harnoor Singh Reen
Student ID: 110006294
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main(int argc, char const *argv[])
{
   int pipefds[2];
   int returnStatus;
   int pid, pid1;
   int readMessage[1];
   returnStatus = pipe(pipefds);
   if (returnStatus == -1)
   {
      printf("Unable to create pipe\n");
      return 1;
   }
   pid = fork();
   // Child process
   if (pid != 0)
   {
      pid1 = fork();
      if (pid1 != 0)
      {
         for (int i = 0; i < 10; i++)
         {
            read(pipefds[0], readMessage, sizeof(readMessage));
            printf("%d is the number read by parent\n", readMessage[0]);
         }
      }
      else
      {
         for (int i = 0; i < 5; i++)
         {
            int randNo = rand() % 100;
            printf("Child Process 2 - Writing to pipe - Message 1 is %d\n", randNo);
            write(pipefds[1], &randNo, sizeof(randNo));
         }
      }
   }
   else
   {
      for (int i = 0; i < 5; i++)
      {
         int randNo = rand() % 100;
         printf("Child Process 1- Writing to pipe - Message 1 is %d\n", randNo);
         write(pipefds[1], &randNo, sizeof(randNo));
      }
   }
   return 0;
}
