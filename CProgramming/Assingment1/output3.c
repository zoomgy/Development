#include <stdio.h>
int main(){
    int a;
    printf("%lu",sizeof(int));
    printf("\n%lu\n",sizeof(-1));
    if (sizeof(a)>-1){
        printf("Yes");
    }
    else {
        printf("No");
    }
return 0;
}    