import java.util.HashMap;
import java.util.Scanner;

public class LogestParanthesisLength {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String:==>");
//        String str = sc.nextLine();
//        char[] inputStr = str.toCharArray();
//        int sum = 0;
//        int maxLength = 0;
//        for (int i = 0; i < inputStr.length; i++) {
//
//            if(inputStr[i] == '('){
//                sum +=1;
//            }
//            if(sum < 0){
//                break;
//            }
//            if(inputStr[i] == ')'){
//                sum -= 1;
//            }
//            if(sum == 0) {
//                maxLength = i+1;
//            }
//        }
//        System.out.println("maxlength:==>"+maxLength);

        HashMap<Object, Integer> hashMap = new HashMap<>();
        Object obj1 = new Object();
        Object obj2 = obj1;
        hashMap.put(obj1,1);
        hashMap.put(obj2,2);
        System.out.println(hashMap.get(obj1));
    }
}
