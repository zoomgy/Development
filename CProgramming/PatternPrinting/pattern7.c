#include <stdio.h>
int main(){
    int i=1,j=1,k=10,l=19;
    while (i<=19){
        while(j<=19){
            if(j<=19&&j>=l){
                printf("*");
            }
            else {
                printf(" ");
            }
            j++;
        }
        printf("\n");
        i=i+1;
        if(i<=10){
        l=l-2;
        }
        else 
        l=l+2;
        j=1;
    }
    return 0;
}