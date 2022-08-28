#include <stdio.h>
int main(){
    int j,l;
    printf("\nEnter array size : ");
    scanf("%d",&j);
    int a[j],i,rev=0,rem,n,k;
    for (i=0;i<j;i++){
        printf("\nEnter element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    for (k=0;k<j;k++){
        int m = 0;
        for (l=0;l<j;l++){
            if(a[k]==a[l]){
            m=m+1;
            }
        }
        printf("  %d : %d  \n",a[k],m);    
        }
    return 0;
    }