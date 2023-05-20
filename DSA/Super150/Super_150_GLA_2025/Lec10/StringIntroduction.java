package DSA.Super150.Super_150_GLA_2025.Lec10;
public class StringIntroduction{
    public static void main(String[] args) {
        // System.out.println(s.charAt(3));
        // System.out.println(s.length());
        // System.out.println(s.substring(1, 1)); //last index not included and this will print empty string.
        // System.out.println(s.trim());
        // System.out.println(s.compareTo("kunal"));
        // System.out.println(('u' - 'o'));
        System.out.println(PersonalComapreTo("Kunal", "Komal"));
    }
    public static int PersonalComapreTo(String s1,String s2){
        int i = 0;
        int j = 0;
        while(i<s1.length() && j < s2.length()){
            if(s1.charAt(i) != s2.charAt(j)){
                return (s1.charAt(i) - s2.charAt(j));
            }
            i++;
            j++;
        }
        return s1.length()-s2.length();
    }
}