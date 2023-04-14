import java.util.*;
public class PrintingNumbersRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printingNumbers(n);
        sc.close();
    }
    public static void printingNumbers(int n){
        if(n==0){
            return;
        }
        printingNumbers(n-1);
        System.out.print(n + " ");
    }
}
