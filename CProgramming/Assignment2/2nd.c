#include <stdio.h>
int main(){
    int a;
    printf ("\nEnter number to check : ");
    scanf("%d",&a);
    if ((a%7)==0){
        printf("\nNumber is divisible by 7\n");
    }
    else if((a%7)!=0){
        printf("\nNumber is not divisible by 7\n");
    }
    else {
        printf("\nHatt be");
    }
    return 0;
}