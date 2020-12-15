#include <stdio.h>

int main(int argc, char *argv[]){  
	FILE *fd;
	
	int ch;

	int fileSize=-1;

	fd = fopen(argv[1], "r+b");     
	/*
	do{
		ch=getc(fd);  //printf("ch=%c ", ch);
		fileSize++;
		printf("fileSize=%d\n", fileSize);
	} while( ch != EOF);
	*/ 
	while( ch != EOF)
	{
		ch=getc(fd);  //printf("ch=%c ", ch);
		fileSize++;
		printf("fileSize=%d\n", fileSize);
	} 
	
	printf("Size of %s is %d\n", argv[1], fileSize);
}
/*
I think the potential problem here is the do while loop Since it checks the condition
after the program is run whereas when using EOF we would ideally want the condition
to be checked after we push the character 

So,
Instead of do-while I will use the while loop in this case
*/
