#include <stdio.h>
#include <string.h>
int main(){

    int len;
    
    char str[20]; // A y u s h
    char ctr[20]; // A y u s h
        scanf("%s",str);
        scanf("%s",ctr);
        int flag;
        for (int i=0;i<strlen(str);i++){
                if(str [i] == ctr[i]){
                    flag = 1;
                }
                else {
                    flag = 0;
                    break;
                }
        }


        if(flag==1){
            printf("Equal");
        }
        else 
            printf ("Not Equal");

    return 0;
}





