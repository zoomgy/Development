public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(7));
    }
    public static int fibonacciRecursive(int n){
        if(n == 0 || n==1){
            return n;
        }
        int f1 = fibonacciRecursive(n-1);
        int f2 = fibonacciRecursive(n-2);
        return f1 + f2;
    }
}
