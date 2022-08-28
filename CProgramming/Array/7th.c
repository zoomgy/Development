#include <stdio.h>
#include <math.h>
int main(){
    int j,l=0,m=0;
    printf("\nEnter array size : ");
    scanf("%d",&j);
    int a[j],i;
    for (i=0;i<j;i++){
        printf("\nEnter element %d : ",i+1);
        scanf("%d",&a[i]);
    }
    for (i=0;i<j;i++){
        m=0;
        while (a[i]!=0){
            a[i]=a[i]/10;
            m=m+1;
        }
        l = l*pow(10,m) + a[i];
    }
    printf("%d",l);
    return 0;
    }