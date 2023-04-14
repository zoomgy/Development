public class FactorialRecursionMethod2 {
    public static void main(String[] args) {
        System.out.println((factorialMethod2(5, 1)));
    }
    public static int factorialMethod2(int n,int ans){
        if(n==0){
            return ans;
        }
        return factorialMethod2(n-1, ans*n);

    }
}
