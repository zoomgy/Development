#include <stdio.h>
int main(){
    int i=1,j=1,k=60,l=60;
    while (i<=19){
        while(j<=100){
            if(j<=k&&j>=l){
                printf("*");
            }
            else {
                printf(" ");
            }
            j++;
        }
        printf("\n");
        i=i+1;
        if (i<=10){
        k=k+3;
        l=l-3;
        }
        else {
        k=k-3;
        l=l+3;
        }
        j=1;
    } 
    return 0;
}