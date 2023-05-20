package DSA.Super150.Super_150_GLA_2025.Lec5;
public class Method_addition{
    static int val =100;
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(addition(5,6));
        System.out.println(val);
    }

    public static int addition(int a,int b) {
        val = 90;
        Method_addition.val = 5;
        return a+b;
    }

}