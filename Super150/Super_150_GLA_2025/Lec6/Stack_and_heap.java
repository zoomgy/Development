public class Stack_and_heap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] other = {10,20,30,40,50};
        System.out.println(arr[0] + " " + other[0]);
        Swap(arr,other);
        System.out.println(arr[0] + " " + other[0]);
    }
    public static void Swap(int[] arr,int[] other){
        int[] temp = arr;
        arr = other;
        other = temp;
    }
}