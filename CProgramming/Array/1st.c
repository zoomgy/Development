#include <stdio.h>
int main(){
    int a[4],i,rev=0,rem,n;
    for (i=0;i<4;i++){
        printf("\nEnter element %d : ",i+1);
        scanf("%d",&a[i]);
        printf("\n");
    }
    for (i=0;i<4;i++){
        rev = 0;
        while(a[i]!=0){
        rem = a[i]%10; 
        a[i]=a[i]/10;
        rev = rev*10+rem;
        }
        a[i]=rev;
    }
    for (i=0;i<=3;i++){
        printf("%d ",a[3-i]);
    }
    return 0;
}