//Write a C program to count total number of words in a string.
#include <stdio.h>
#include <string.h>
int main(){
    char a[200];
    printf("Enter a string : ");
    scanf("%[^\n]s", a);
    printf("\t%s",a);
    int flag = 0;
        for(int i=0;a[i]!='\0';i++){
            if(a[i] == 32 &&  a[i+1]!=32){
                flag=flag+1;
            }
        }
        printf("\n\tNumber of Words : %d\n",flag+1);
    return 0;
}