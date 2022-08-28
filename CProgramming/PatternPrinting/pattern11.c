#include <stdio.h>
int main(){
    int i,j,k=10,l=10;
    for (i=1;i<=5;i++){
        for (j=1;j<=((2*i)-1);j++){
                if((j>=k)&&(j<=l)){
                    printf("*");
                }
                else 
                printf(" ");
        }
        k=k-1;
        l=l+1;
        printf("\n");
    }
    return 0;
}