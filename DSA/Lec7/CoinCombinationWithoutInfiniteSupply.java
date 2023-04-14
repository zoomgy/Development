public class CoinCombinationWithoutInfiniteSupply {
    public static void main(String[] args) {
        int[] coinArray = {2,3,5};
            coinPermutation(coinArray, 0, "",0);
    }
    public static void coinPermutation(int[] coinArray,int sum,String ans,int k){
        if(sum == 10){
            System.out.println(ans);
            return;
        }
        if(sum > 10){
            return;
        }
        for (int i = k; i < coinArray.length; i++) {
            coinPermutation(coinArray,sum + coinArray[i], ans + coinArray[i],i+1);
        }                                                                                                 
    }
}
