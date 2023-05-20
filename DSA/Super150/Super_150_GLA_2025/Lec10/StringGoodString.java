package DSA.Super150.Super_150_GLA_2025.Lec10;
public class StringGoodString{
    public static void main(String[] args) {
        String s = "aaaaaaadddddddaaa";
        int max_length = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if((GoodStringChecker(s.substring(i, j+1)) == 1) && s.substring(i, j+1).length()>max_length){
                    max_length = s.substring(i, j+1).length();
                }
            }
        }
        System.out.println(max_length);
    }
    public static int GoodStringChecker(String test){
        int i = 0;
        while(i<test.length()){
            if('a' == test.charAt(i) || 'e' == test.charAt(i) || 'i' == test.charAt(i) || 'o' == test.charAt(i) || 'u' == test.charAt(i)){
                i++;
            }
            else{
                return 0;
            }
        } 
        return 1;
    }
}