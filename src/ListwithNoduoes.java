import java.util.*;
import java.util.stream.Collectors;

public class ListwithNoduoes {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        List<Integer> listwithoutDupes = new LinkedList<>(new HashSet<Integer>(listWithDuplicates));

        System.out.println(listwithoutDupes);


        List<Integer> withStreamLst = listWithDuplicates.stream().distinct().collect(Collectors.toList());

        System.out.println("withStream:==>"+withStreamLst);
    }
}
