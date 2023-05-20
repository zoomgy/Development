package DSA.Super150.Super_150_GLA_2025.Lec10;
public class StringPallindrom {
    public static void main(String[] args) {
        System.out.println(Checkpallindrom("NamnaN"));
    }
    public static boolean Checkpallindrom(String test){
        for(int i = 0 ; i<(test.length())/2;i++){
            if(test.charAt(i)!=test.charAt(test.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
