#include <stdio.h>
int main(){
    int i=1,n,j=0;
    printf("Enter last natural number :");
    scanf("%d",&n);
    while (i<=n){
        j=j+i;
        i=i+1;
    }
    printf("\n%d",j);
    return 0;
}