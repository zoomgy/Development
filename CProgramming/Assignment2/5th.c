#include <stdio.h>
int main(){
    int a,b;
    printf ("\nEnter first number to check : ");
    scanf("%d",&a);
    printf ("\nEnter second number to check : ");
    scanf("%d",&b);
    if (a>b){
        printf("\nFirst number is greater\n");
    }
    else if(b>a){
        printf("\nSecond Number is greater\n");
    }
    else if(a==b){
        printf("\nNumbers are equal\n");
    }
    else {
        printf ("\nHatt be\n");
    }
    return 0;
}