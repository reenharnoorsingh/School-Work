#include <unistd.h>
#include<fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 100000

int main(int argc, const char * argv[]) {
    size_t count;
    char word[MAX];
    int lines = 0;
    
    int fd = open("f1.txt", O_RDONLY, "r");
  
    while((count = read(fd,&word,MAX))>0){
        for(int i=0;i<count;i++){
            if (word[i] == '\n'){
                ++lines;
            }
        }
    }
    close(fd);
    printf("The file has %d lines\n", lines+1);
    
}