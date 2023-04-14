import java.util.*;

public class FactorialRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fn = factorial(n-1);
        return n * fn;

    }

}