package DSA.Super150.Super_150_GLA_2025.Lec10;
public class VowelInStringsChecker {
    public static void main(String[] args) {
        System.out.println(GoodStringChecker("aeiou"));
    }
    public static int GoodStringChecker(String test){
        int initial1 = 0;
        int i = 0;
        while(i<test.length()){
            if('a' == test.charAt(i)){
                initial1 = 1;
                break;
            }
            i++;
        }
         i = 0;
        int initial2=0;
        while(i<test.length()){
            if('e' == test.charAt(i)){
                initial2 = 1;
                break;
            }
            i++;
        }
        i = 0;
        int initial3 = 0;
        while(i<test.length()){
            if('i' == test.charAt(i)){
                initial3 = 1;
                break;
            }
            i++;
        }
        i = 0;
        int initial4 = 0;
        while(i<test.length()){
            if('o' == test.charAt(i)){
                initial4 = 1;
                break;
            }
            i++;
        }
        i = 0;
        int initial5 = 0;
        while(i<test.length()){
            if('u' == test.charAt(i)){
                initial5 = 1;
                break;
            }
            i++;
        }
        if(initial1 == 1 && initial2 ==1 && initial3 == 1 && initial4 ==1 && initial5 ==1){
            return 1;
        }
        else{
            return 0;
        }        
    }
}
