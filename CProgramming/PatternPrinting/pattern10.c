#include <stdio.h>
int main (){
    int i,j;
    for (i=1;i<=5;i++){
        for (j=1;j<=i;j++){
            if(j==i||j==(i-2)||j==(i-4))
            printf("1 ");
            else 
            printf("0 ");
        }
        printf("\n\n");
    }
    return 0;
}