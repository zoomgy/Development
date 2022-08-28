#include <stdio.h>
int main(){
    int a;
    printf ("\nEnter number to check : ");
    scanf("%d",&a);
    if (a>0){
        printf("\nNumber is positive\n");
    }
    else if(a<0){
        printf("\nNumber is negative\n");
    }
    else {
        printf("\nNumber is 0\n");
    }
    return 0;
}