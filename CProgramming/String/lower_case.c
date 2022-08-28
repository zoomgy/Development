

#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    scanf("%s",str);
        int i;
        for (i=0;i<strlen(str);i++){
            if(str[i]>=65&&str[i]<=90){
               str [i] = str [i] + 32;
            }
        }

        printf ("\n\n%s\n\n",str);

        return 0;
}