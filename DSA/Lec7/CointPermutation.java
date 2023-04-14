public class CointPermutation {
    public static void main(String[] args) {
        int[] coinArray = {2,3,5};
        for (int i = 0; i < coinArray.length; i++) {
            coinPermutation(coinArray[i], 0, "",coinArray);
        }
    }
    public static void coinPermutation(int number,int sum,String ans,int[] coinArray){
        if(sum == 10){
            System.out.println(ans);
            return;
        }
        if(sum > 10){
            return;
        }
        for (int i = 0; i < coinArray.length; i++) {
            coinPermutation(coinArray[i], sum + coinArray[i], ans + coinArray[i],coinArray);
        }
    }
}
