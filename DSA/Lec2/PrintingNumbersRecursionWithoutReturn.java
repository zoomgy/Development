public class PrintingNumbersRecursionWithoutReturn {
    public static void main(String[] args) {
        printingNumbersInSequence(5);
        System.out.println();
        printingNumbersReverse(5);
    }
    public static void printingNumbersReverse(int n){
        if(n>0){
            System.out.print(n + " ");
            printingNumbersReverse(n-1);
        }
    }
    public static void printingNumbersInSequence(int n){
        if(n>0){
            printingNumbersInSequence(n-1);
            System.out.print(n + " ");
        }
    }
}
