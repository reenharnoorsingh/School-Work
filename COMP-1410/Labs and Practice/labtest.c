#include <stdio.h>
#define MAXSIZE 20
void Read2DArray(int n, int mat[][n])
{
    //provide implementation
    printf("Enter the elements of your matrix");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &mat[i][j]);
        }
    }
}
void Print2DArray(int n, int mat[][n])
{
    //provide implementation
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("%d\t", mat[i][j]);
            printf("\n");
        }
    }
}
int LinearSearch(int key, int n, int rows, int cols, int mat[][cols])
{
    //please provide implementation
    if (cols <= -1) // Base case
    {
        rows--;
        cols = n - 1;
    }
    if (rows <= -1) // Base case
        return 0;
    if (key == mat[rows][cols]) // Check for key
        return 1;
    return LinearSearch(key, n, rows, cols - 1, mat);
}
int main()
{
    int mat[MAXSIZE][MAXSIZE];
    int n, key;
    printf("\n\n");
    printf("Please enter the size of your square matrix: ");
    scanf("%d", &n);
    printf("Enter search key: ");
    scanf("%d", &key);
    Read2DArray(n, mat);
    printf("The matrix entered by the user\n\n");
    Print2DArray(n, mat);
    printf("The search result for %d returned: %d\n", key, LinearSearch(key, n, n - 1, n - 1, mat));
}
