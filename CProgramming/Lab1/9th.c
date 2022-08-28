#include <stdio.h>
int main(){
    int i=1,n;
    printf("Enter number :- ");
    scanf("%d",&n);
    while (i<=10){
        printf("%d  *  %d  =  %d\n",n,i,i*n);
        i+=1;
    }
    return 0;
}