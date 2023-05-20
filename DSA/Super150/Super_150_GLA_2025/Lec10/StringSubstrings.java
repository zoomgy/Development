package DSA.Super150.Super_150_GLA_2025.Lec10;
public class StringSubstrings {
    public static void main(String[] args) {
        String s = "692239";

            //BreadthWise Generation of Substring.
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.println(s.substring(i, j+1));
            }
        }
            // LengthWise Generation of Substring.
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                System.out.println(s.substring(j,j+i+1));
            }
        }
    }
}
