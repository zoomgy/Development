#include <stdio.h>
#include <string.h>
int main(){
    
    char str[20]; //Ayush
    char ctr[20]; //Pratap
    scanf("%s",str);
    scanf("%s",ctr);
    int a = strlen(str);
    int b = strlen(ctr);
    char  trr[a+b];


  //index   -     0  1  2  3  4 
    //    str =     A  y  u  s  h
  //index   -     0  1  2  3  4  5 
     //   ctr =     P  r  a  t  a  p
  //index   -     0  1  2  3  4  5  6  7  8  9  10
    //    trr =     A  y  u  s  h  P  r  a  t  a  p

        for (int i = 0 ; i <= a+b;i++){
            if(i<=strlen(str)-1){
                trr[i] = str[i];
            }
            else if(i>strlen(str)-1){
                trr [i] = ctr [i-strlen(str)];
            }
            else 
              break;
        }
    printf("\n\n\n%s\n\n\n",trr);
    
    
    return 0;
}
