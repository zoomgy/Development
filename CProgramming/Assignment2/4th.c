#include <stdio.h>
int main(){
    int a;
    printf ("\nEnter number to check : ");
    scanf("%d",&a);
    if ((a%2)==0){
        printf("\nNumber is even\n");
    }
    else if((a%2)==1){
        printf("\nNumber is odd\n");
    }
    else {
        printf("\nHatt be");
    }
    return 0;
}