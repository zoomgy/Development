package DSA.Super150.Super_150_GLA_2025.Lec2;
import java.util.*;

public class TakingInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        sc.close();
    }
}