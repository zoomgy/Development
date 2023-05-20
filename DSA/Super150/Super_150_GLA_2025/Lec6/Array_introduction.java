package DSA.Super150.Super_150_GLA_2025.Lec6;
import java.util.Scanner;

public class Array_introduction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println(arr);
        int[] other = arr;
        System.out.println(other);
        System.out.println(arr[0]);
        System.out.println("tejveer rajput");
        arr[0]=1;
        arr[1]=11;
        arr[2]=111;
        arr[3]=1111;
        arr[4]=11111;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        sc.close();
    }
}