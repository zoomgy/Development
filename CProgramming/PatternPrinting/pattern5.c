#include <stdio.h>
int main(){
    int i=1,j=1,k=10,l=10;
    while (i<=10){
        while(j<=19){
            if(j==k||j==l||(i==10&&j%2!=0)){
                printf("*");
            }
            else {
                printf(" ");
            }
            j++;
        }
        printf("\n");
        i=i+1;
        k=k+1;
        l=l-1;
        j=1;
    }
    return 0;
}