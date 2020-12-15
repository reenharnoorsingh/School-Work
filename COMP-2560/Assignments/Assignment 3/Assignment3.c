/*
Name : Harnoor Singh Reen
Student id: 110006294
*/

//Program starts now

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

//childFunction
int childFunction(char *line)
{
    int n1, n2;
    char op;
    write(1, "I am a child working for my parent\n", 36);
    sscanf(line, " %d %c %d ", &n1, &op, &n2);
    sleep(1);

    if (sscanf(line, " %d %c %d", &n1, &op, &n2) != 3)
    {
        exit(50);
    }
    if (op == '/' && n2 == 0)
    {
        exit(100);
    }
    switch (op)
    {
    case '+':
        printf(" %d %c %d = %d\n\n", n1, op, n2, n1 + n2);
        break;

    case '-':
        printf(" \n%d %c %d = %d\n\n", n1, op, n2, n1 - n2);
        break;

    case '/':
        printf(" \n%d %c %d = %d \n\n", n1, op, n2, n1/n2);
        break;

    case '*':
        printf("\n %d %c %d = %d\n\n", n1, op, n2, n1 * n2);
        break;

    default:
        exit(200);
        break;
    }
    exit(0);
}
//main function
int main()
{
    char input;
    char *line = &input;
    char str[100];
    int status;
    int pid;
    printf(" This program makes simple arithmetics \n");
    while (1)
    {
        write(1, "Enter an arithmetic statement\n", 31);
        input = scanf("%[^\n]%*c", str);
        pid = fork();
        if (pid == -1)
        {
            perror(" Impossible to fork\n");
            exit(0);
        }
        else if (pid == 0)
            childFunction(str);
        else
        {
            if (pid > 0)
            {
                write(1, "\n created a child to make your operation , waiting\n", 49);
                wait(&status);
                if (WEXITSTATUS(status) == 50)
                    printf(" Wrong Statement \n\n");
                else if (WEXITSTATUS(status) == 100)
                    printf("Division by zero\n\n");
                else if (WEXITSTATUS(status) == 200)
                    printf("Wrong Operator\n\n");
            }
        }
    }
    return (0);
}