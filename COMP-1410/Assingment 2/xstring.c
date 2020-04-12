/*
 * Use this file to complete the implementation of the xstring library
 */

int FindFirstOccurrence(char c, char *pStr)
{
    int i = 0;
    for (i = 0; *pStr != '\0'; i++) //loop until the end of the string
    {
        if (*pStr++ == c) // check the target is found or not
        {
            return i;
        }
    }
    return -1;
}

int FindLastOccurrence(char c, char *pStr)
{
    int index = 1;
    for (int i = 0; *pStr != '\0'; i++)
    {
        if (*pStr++ == c)
        {
            index = i; //if the target character is found we assign to the index variable
        }
    }
    return index; // we return the last index assigned
}

int GetStringWeight(char *pStr)
{
    int sum = 0;
    while (*pStr != '\0')
    {
        sum = sum + *pStr; //adding ASCII value
        pStr++;
    }
    return sum;
}

void ReplaceCharacter(char x, char c, char *pStr)
{
    for (; *pStr != '\0'; pStr++)
    {
        if (*pStr == x)
            *pStr = c; // if character is found we replacing with c variable character
    }
}

// You could use (call) this function to help you implement the RemoveCharacter function
// Make sure that DeleteChartAt keep the char array a valid C String  ends with '\0'
void DeleteCharAt(int index, int size, char array[])
{

    if (index < 0 || index > size - 1)
        return;

    for (int i = index; i < size - 1; i++)
    {
        array[i] = array[i + 1];
    }
}

void RemoveCharacter(char c, char str[])
{
    int i = 0, len = 0;
    while (str[len++] != '\0')
        ;
    while (str[i] != '\0')
    {
        if (str[i] == c)
        {
            DeleteCharAt(i, len--, str);
            i--;
        }
        i++;
    }
}
int StringLength(char *pStr) //added this
{
    int c = 0;
    while (*(pStr + c) != '\0')
    {
        c++;
    }
    return c;
}
void ReverseString(char *pStr)
{
    int length, c = 0;
    char *begin, *end, temp;
    begin = pStr;
    end = pStr;

    length = StringLength(pStr);

    for (c = 0; c < length - 1; c++)
        end++;
    for (c = 0; c < length / 2; c++)
    {
        temp = *end;
        *end = *begin;
        *begin = temp;
        begin++;
        end--;
    }
}

void ToUpperCase(char *pStr)
{
    while (*pStr)
    {
        *pStr = (*pStr >= 'a' && *pStr <= 'z') ? *pStr - 32 : *pStr; 
        pStr++;
    }
}

void ToLowerCase(char *pStr)
{
    while (*pStr)
    {
        *pStr = (*pStr >= 'A' && *pStr <= 'Z') ? *pStr + 32 : *pStr;
        pStr++;
    }
}