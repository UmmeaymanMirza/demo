import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Cares";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            boolean result = Arrays.equals(char1,char2);

            if(result) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }


    }
}
