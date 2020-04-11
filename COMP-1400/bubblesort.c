#include <stdio.h>
#include <time.h>
#include <stdlib.h>
void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

// A function to implement bubble sort
void bubbleSort(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n - 1; i++)

        // Last i elements are already in place
        for (j = 0; j < n - i - 1; j++)
            if (arr[j] > arr[j + 1])
                swap(&arr[j], &arr[j + 1]);
}

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main()
{
    int n;
    printf("Enter a positive integer:");
    //reading number
    scanf("%d", &n);
    //creating an int array with size n
    int a[n];

    //generating n positive random values
    for (int i = 0; i < n; i++)
    {
        int k = rand() % 1000; //
        if (k < 0)
            k = k * -1;
        a[i] = k;
    }

    //now starting timer
    clock_t t;
    t = clock();
    //   printArray(a,n);
    //calling bubblesort
    bubbleSort(a, n);
    //stopping tiem
    t = clock() - t;
    double time_elapsed = ((double)t) / CLOCKS_PER_SEC;
    printf("Sorted array:");
    printArray(a, n);
    printf("Time elapsed:%f\n", time_elapsed);

    return 0;
}