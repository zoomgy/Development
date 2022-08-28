#include <stdio.h>
int main(){
    int i=1,n=0,j=0;
    printf("Enter last natural number :");
    scanf("%d",&n);
    while (i<=n){
        if(i%2==0)
        j=j+i;
        i=i+1;
    }
    printf("Sum :- %d",j);
    return 0;
}