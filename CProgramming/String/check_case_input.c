

#include <stdio.h>
#include <string.h>
int main(){
    char str[100];
    scanf("%s",str);
    int a = strlen(str);
    char vowel[a],consonant[a],numeric[a],special[a];
        int i,m=0,n=0,o=0,p=0;
        for (i=0;i<a;i++){
            if((str[i]>=65&&str[i]<=90)||(str[i]>=97&&str[i]<=122)){
                if(str[i]==65||str[i]==69||str[i]==73||str[i]==79||str[i]==85||str[i]==97||str[i]==101||str[i]==105||str[i]==111||str[i]==117){
                vowel[m] = str [i];
                    m++;
                }
                else{
                consonant [n] = str [i];
                    n++;
                }
            }
            else if (str[i]>=48&&str[i]<=57){
                numeric[o]=str[i];
                    o++;
            }
            else {
                special [p] = str [i];
                    p++;
            }
            }
            printf("\n\n    %s\n\n    %s\n\n    %s\n\n    %s\n\n",vowel,consonant,numeric,special);
        

        return 0;
}