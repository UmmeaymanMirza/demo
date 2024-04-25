import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BalancedBrackets {
    private static boolean isBracketsBalanced(String str) {
       // Deque<Character> stack = new ArrayDeque<>();

//        for (int  i= 0;  i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(ch == '(' || ch == '{' || ch == '['){
//                stack.push(ch);
//                continue;
//            }
//            if(stack.isEmpty()){
//                return false;
//            }
//
////            using switch case
////            char popChar;
////            switch (ch){
////          Longe      case ')':
////                    popChar = (char) stack.pop();
////                    if(popChar == '{' || popChar == '[')
////                        return false;
////                    break;
////                case '}':
////                    popChar = (char) stack.pop();
////                    if(popChar == '(' || popChar == '[')
////                        return false;
////                    break;
////                case ']':
////                    popChar = (char) stack.pop();
////                    if(popChar == '{' || popChar == '(')
////                        return false;
////                    break;
//
//            }
//        }

//


        //String Approach
        if(str == null || str.length()%2 != 0){
            return false;
        } else {
            for (char ch: str.toCharArray()
                 ) {
                if(!(ch=='{' || ch=='(' || ch=='[' || ch=='}' || ch==')' || ch==']')){
                        return false;
                }
            }
        }
        while(str.contains("()") || str.contains("{}") || str.contains("[]")){
            str = str.replaceAll("\\(\\)","").replaceAll("\\{\\}","")
                    .replaceAll("\\[\\]","");
        }
        return str.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");

        String str = sc.nextLine();
        boolean isbalanced = isBracketsBalanced(str);

        System.out.println("Balanced or not:"+(isbalanced ? "Balanced" : "Unbalanced"));
    }


}
