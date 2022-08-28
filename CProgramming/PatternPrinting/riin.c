#include <stdio.h>
int main()
{   int m = 21;
    for (int i = 1; i <= 10; i++)
    {
        for (int j = 1; j <= 21; j++)
        {
            if (j <= i)
            {
                printf("%d ", j);
            }
            else if (j >= m)
            {
                printf("%d ", (22 - j));
            }
            else
            {
                printf("  ");
            }
        }
        m = m - 1;
        printf("\n\n");
    }
}