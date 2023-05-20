package DSA.Super150.Super_150_GLA_2025.Lec6;
import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Hard Code Array
        

        Display(arr);
        sc.close();
    }
    public static void Display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
