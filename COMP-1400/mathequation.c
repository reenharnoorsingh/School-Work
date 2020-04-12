// Write a C function, named distance, that receives four double floating-point numbers, 𝒙𝟏, 𝒚𝟏, 𝒙𝟐, and 𝒚𝟐. 
// This function should compute and return the custom distance of two points with the coordination (𝒙𝟏,𝒚𝟏) and (𝒙𝟐,𝒚𝟐), 
// using the equation 𝒅 = √(𝒙𝟐 − 𝒙𝟏)𝟓 + (𝒚𝟐 − 𝒚𝟏)𝟓.

#include <stdio.h>
#include <math.h>

//function to calculate the distance
float distance(float x1, float y1, float x2, float y2)
{

    //calcuating distance
    float d = pow(x2 - x1, 5) + pow(y2 - y1, 5);
    d = sqrt(d);

    return d;
}

int main()
{
    //to store the coordinates
    float x1, x2, y1, y2;

    //input of coordinates
    printf("Enter x1: ");
    scanf("%f", &x1);
    printf("Enter y1: ");
    scanf("%f", &y1);
    printf("Enter x2: ");
    scanf("%f", &x2);
    printf("Enter y2: ");
    scanf("%f", &y2);

    //calling function and printing the result
    printf("Distance is %f", distance(x1, y1, x2, y2));

    return 0;
}
