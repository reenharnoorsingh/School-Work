/*
Name : Harnoor Singh 
Student id: 110006294
*/
#include "smallsh.h"

static char inpbuf[MAXBUF], //removed tokbuf
	*ptr = inpbuf;

int inarg(char c);

int userin(char *p)
{
	int c, count;
	ptr = inpbuf;

	printf("%s", p);
	count = 0;
	while (1)
	{
		if ((c = getchar()) == EOF)
			return (EOF);
		if (count < MAXBUF)
			inpbuf[count++] = c;
		if (c == '\n' && count < MAXBUF)
		{
			inpbuf[count] = '\0';
			return count;
		}

		if (c == '\n')
		{
			printf("smallsh: input line too long\n");
			count = 0;
			printf("%s ", p);
		}
	}
}

int gettok(char **outptr)
{
	int type;
	*outptr = ptr; //points to inpbuf
	while (*ptr == ' ' || *ptr == '\t')
		ptr++;
	//checks conditions
	switch (*ptr++)
	{
	case '\n':
		type = EOL;
		break;
	case '&':
		type = AMPERSAND;
		break;
	case ';':
		type = SEMICOLON;
		break;
	default:
		type = ARG;

		while (inarg(*ptr))
			*ptr++;
	}
	//find the end of the line and replace that by '\0'
	if (*ptr == '\n') // last line
	{
		*ptr++ = '\0'; // adding \0
		*ptr = '\n';   // adding last line again
	}
	else // else add \0
	{
		*ptr++ = '\0';
	}

	return type;
}

//****************************************************************************************
static char special[] = {' ', '\t', '&', ';', '\n', '\0'};
int inarg(char c)
{
	char *wrk;
	for (wrk = special; *wrk; wrk++)
	{
		if (c == *wrk)
			return (0);
	}
	return (1);
}
