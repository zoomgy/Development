#include <stdio.h>
#include <string.h>
int main(){
    char a[200];
    fgets(a,50,stdin);
    int x = strlen(a);
        int i,j,flag=1,counter = 0;
            for (i=0;i<x;i++){
                counter = 0;
                for (j=0;j<x;j++){
                    if(a[i]==a[j]){
                        counter = counter + 1;
                    }
                }
                printf("%c - %d\n",a[i],counter);
            }
    return 0;
}