#include <stdio.h>
int factorial(int num1){
    if(num1==1||num1==0){
        return 1;
    }
    else 
        return num1 * factorial(num1-1);
}
int main(){
    int a;
    printf("Enter a number : ");
    scanf("%d",&a);
    printf("The Factorial of %d is %d\n\n",a,factorial(a));
    return 0;
}