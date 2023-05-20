package DSA.Super150.Super_150_GLA_2025.Lec3;
import java.util.*;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 0;
        int i = 0;

        while(row < n){
            i = 0;
            int val = 1;
            while(i<star){
                System.out.print(val + " ");
                val = ((row - i) * val)/(i+1);
                i++; 
            }
            star ++;
            System.out.println();
            row ++;
        }
        sc.close();
    }
}