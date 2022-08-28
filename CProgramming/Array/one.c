#include <stdio.h>
#include <string.h>
int main(){
    int a[10];
        printf("\nEnter the elements of the array : ");
        for(int i=0;i<20;i++){
            if(i>=0&&i<=9){
                scanf("%d",&a[i]);
            }
            if(i>=10&&i<20){
                printf("  %d  ",a[i-10]);
            }
        }
    return 0;
}