import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int j = 1;
        int k = 5;
        while(i<=9){
            j = 1;
            while(j<=5){
                if(j<=5 && j>=k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
            if(i>=1 && i<=5){
                k--;
            }
            else {
                k++;
            }
        }
        sc.close();
    }
}
