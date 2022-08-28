#include <stdio.h>
int main(){
    int n,i=0;
    scanf("%d",&n);
    while (n!=0){
        n=n/10;
        i=i+1;
    }
    printf("\n%d\n",i);
    return 0;
}