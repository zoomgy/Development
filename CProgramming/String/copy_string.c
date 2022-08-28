#include <stdio.h>
#include <string.h>
int main(){
    
    char str[20]; 
    char trr[20];
    char ctr[20]; 
    
    scanf("%s",str);
    scanf("%s",ctr);
    
    int len = strlen(str);
    
    int i;
    for (i=0;i<len;i++){

        trr[i]=str[i];

    }

    printf("\n\n%s\n\n",trr);
    return 0;
}
