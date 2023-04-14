public class SortingInJava{
    public static void main(String[] args) {
        //Bubble Sort
        int[] arr = {3,5,4,2,1};
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}