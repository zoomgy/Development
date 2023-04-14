public class CoinCombinationWithInfiniteSupply {
    public static void main(String[] args) {
        int[] coinArray = {2,3,6,7};
            coinPermutation(coinArray, 0, "",0);
    }
    public static void coinPermutation(int[] coinArray,int sum,String ans,int k){
        if(sum == 7){
            System.out.println(ans);
            return;
        }
        if(sum > 7){
            return;
        }
        for (int i = k; i < coinArray.length; i++) {
            coinPermutation(coinArray,sum + coinArray[i], ans + coinArray[i],i);
        }                                                                                                 
    }
}
