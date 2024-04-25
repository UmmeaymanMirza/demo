import java.util.*;
import java.io.*;

class BracketMatcher {

    public static String BracketMatcher(String str) {
        // code goes here

        if(!(str.contains("(") || str.contains(")"))){
            return "1";
        } else {
            int countStart = 0;
            int countEnd = 0;
            for(char ch : str.toCharArray()){
                if(ch == '('){
                    countStart++;

                } else if (ch == ')') {
                    countEnd++;
                }
            }
            if(countStart == countEnd) {
                return "1";
            } else {
                return "0";
            }
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Enter string:==");
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }

}