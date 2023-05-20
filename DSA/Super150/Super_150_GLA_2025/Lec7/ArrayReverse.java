package DSA.Super150.Super_150_GLA_2025.Lec7;
public class ArrayReverse{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int length = a.length;
        a = Swap1(a,length);
        System.out.println();
        for(int i=0;i<length;i++){ 
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int[] Swap1(int[] a,int length){
        int temp;
        for (int i = 0 ; i < length/2 ; i++){
            temp = a[i];
            a[i] = a[length - i - 1];
            a[length -i - 1] = temp;
        }
        return a;
    }
}