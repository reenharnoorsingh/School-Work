/*
Name: Harnoor Singh Reen
Student id: 110006294
*/

#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <signal.h>

int main()
{
    for (int signalCounter = 1; signalCounter < NSIG; signalCounter++)
    {
        printf("%d -- %s\n", signalCounter, strsignal(signalCounter)); //Signal Number -- Signal Name 
    }
    return 0;
}
/*
I found in total of 64 commands printed on the terminal but if we exclude 
32 -- Unknown signal 32
33 -- Unknown signal 33
We have 62 commands
*/