#include <stdio.h>
int main (){
    int i,j;
    for (i=1;i<=5;i++){
        for (j=1;j<=i;j++){
            if (i%2==0){
                if(j%2==0){
                    printf("1");
                }
                if(j%2==1){
                    printf("0");
                }
            }
            if (i%2==1){
                if(j%2==1){
                    printf("1");
                }
                if(j%2==0){
                    printf("0");
                }
            }
        }
        printf("\n");
    }
    return 0;
}