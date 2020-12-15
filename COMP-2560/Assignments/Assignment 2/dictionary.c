#include <stdio.h>
#include "dict.h"

int writedict(const char *dictname, struct dict_elem *elist)
{

	int j;
	FILE *outf;

	if ((outf = fopen(dictname, "w")) == NULL)
	{
		return ERROR;
	}

	//cculate length of the aray
	for (j = 0; elist[j].d_length != 0; j++)
		;

	//write out list of dict_elem structures
	if (fwrite((void *)elist, sizeof(struct dict_elem), j, outf) < j)
	{
		fclose(outf);
		return ERROR;
	}

	fclose(outf);
	return SUCCESS;
}

//**********

struct dict_elem *readdict(const char *dictname,
						   struct dict_elem *inlist, int maxlength)
{

	int i;
	FILE *inf;

	if ((inf = fopen(dictname, "r")) == NULL)
	{
		return NULL;
	}
	//read in dict_elem structures from file
	for (i = 0; i < maxlength - 1; i++)
	{
		if (fread((void *)&inlist[i], sizeof(struct dict_elem), 1, inf) < 1)
		{
			break;
		}
	}

	fclose(inf);

	//mask end of list
	inlist[i].d_length = 0;

	return inlist;
}

// your main function goes here.
int main(void)
{

	struct dict_elem array[4] = {{"name1", 0, 5, 1}, {"name2", 0, 5, 1}, {"name3", 0, 5, 1}, {"name4", 0, 5, 1}}; // adding dict_elem

	//copying arrays data to a text file
	if (writedict("testDict.txt", array) != SUCCESS)
	{
		printf("Error while writing the file");
	}

	const int maxlength = 5;

	struct dict_elem readArr[maxlength];
	//reading the file
	if (readdict("testDict.txt", readArr, maxlength) == NULL)
	{
		printf("Error while reading the file");
	}

	//printing d_name
	for (int i = 0; i < maxlength - 1; i++)
	{
		printf("%s \n", readArr[i].d_name);
	}
	return 0;
}