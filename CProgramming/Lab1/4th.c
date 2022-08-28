#include <stdio.h>
int main(){
    int i=1,n=100;
    printf("Enter last natural number :");
    scanf("%d",&n);
    while (i<=n){
        if(i%2==0)
        printf("%d ",i);
        i=i+1;
    }
    return 0;
}