/*
Name: Harnoor Singh Reen
Student id : 110006294
Lab Section: 51
*/
// Using Standard I/O function write a C program to combine multiple text files into a single file
// and display the contents of the combined file


//header files
#include <stdio.h>
#include <stdlib.h>

//main function
int main(int argc, char const *argv[])
{
    //arguement check
    if(argc <=1){
        printf("No files in command");
        exit(0);
    }
    //Opens file and stores the result
    FILE *fpOutput = fopen(argv[argc-1],"w");
    char c;
    //iterating till the end of command line
    for (int i = 1; i < argc; i++){
        FILE *fp = fopen(argv[i],"r");//read the files
        if(fp == NULL){
            printf("Files cant be opened");
            continue;
        }
        while ((c=fgetc(fp))!= EOF) //copy the contents to a new file
            fputc(c,fpOutput);
        //closing the fp stream
        fclose(fp);
    }
    fclose(fpOutput);
    printf("Merged all the files");
    
    return 0;
}