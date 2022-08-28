#include <stdio.h>
int main(){
    int i=1,j=1,k=50,l=50;
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
        printf("\n\n");
        i=i+1;
        if (i<=10){
        k=k+2;
        l=l-2;
        }
        else {
        k=k-2;
        l=l+2;
        }
        j=1;
    }
    return 0;
}