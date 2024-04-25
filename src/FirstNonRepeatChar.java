import java.util.*;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String inputStr ="rrqquunnwklmnmw";
        boolean flag = true;


       Character ch = getFirstNonRepeatingChar(inputStr);

        System.out.println("Fist non repeat char:==>"+ch);

        Map<Character, Integer> map = new LinkedHashMap();

        for (char ch1 : inputStr.toCharArray())
            map.put(ch1, map.containsKey(ch1) ? map.get(ch1) + 1 : 1);

        Optional<Map.Entry<Character, Integer>> firstNobRepeating = map.entrySet().stream()
                .filter(x->x.getValue() == 1).findFirst();

        System.out.println("Fist non repeat char:==>"+(firstNobRepeating.isPresent()?firstNobRepeating.get().getKey() : null));
    }

    private static Character getFirstNonRepeatingChar(String inputStr) {
        if(inputStr == null || inputStr.isEmpty()) {
            return null;
        }
        Map<Character, Integer> mpStr = new HashMap<>();
        for (int i = 0; i < inputStr.length(); i++) {
            Character ch = inputStr.charAt(i);
            mpStr.put(ch,mpStr.getOrDefault(ch,0)+1);
        }
        System.out.println("Map:==>"+mpStr);
        for(char ch:inputStr.toCharArray()){
            if(mpStr.get(ch) == 1){
                return ch;
            }
        }
        return null;
    }
}
