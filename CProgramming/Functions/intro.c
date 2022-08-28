//functions divide large c program into smaller pieces
//No need to write long code again and again just divide into functions
#include <stdio.h>
char print_star(int num1,int num2){
    printf("Hello World = ");
    return 'l';
}
int main(){
    char a;
    print_star(5,6);
    printf("%c\n",print_star(5,6));
    return 0;
}